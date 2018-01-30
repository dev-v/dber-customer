package com.dber.customer.config;

import java.io.IOException;

import javax.sql.DataSource;

import com.dber.config.SystemConfig;
import com.dber.cache.config.CacheConfig;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.dber.base.mybatis.plugin.pagination.PaginationInterceptor;
import com.dber.base.util.DBUtil;

/**
 * <li>文件名称: CustomerService.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月21日
 * @author dev-v
 */
@Configuration
@EnableConfigurationProperties({SystemConfig.class})
@EnableAutoConfiguration
@EnableTransactionManagement
@Import({CacheConfig.class})
@ComponentScan("com.dber.customer.service")
@MapperScan(basePackages = { "com.dber.customer.mapper" })
public class CustomerServiceConfig {
	@Autowired
	private SystemConfig systemConfig;

	@Bean
	public DataSource customerDataSource() {
		DataSource customerDataSource = DBUtil.dataSource(systemConfig.getService().getDatabase());
		return customerDataSource;
	}

	@Bean
	public DataSourceTransactionManager customerTransactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(customerDataSource());
		return transactionManager;
	}

	@Bean
	public org.apache.ibatis.session.Configuration customerMybatisConfiguration() {
		org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
		configuration.setMapUnderscoreToCamelCase(true);
		configuration.getTypeAliasRegistry().registerAliases("com.dber.customer.api.entity");
		return configuration;
	}

	@Bean
	public SqlSessionFactoryBean customerSqlSessionFactoryBean() throws IOException {
		SqlSessionFactoryBean customerSqlSessionFactoryBean = new SqlSessionFactoryBean();

		customerSqlSessionFactoryBean.setDataSource(customerDataSource());

		customerSqlSessionFactoryBean.setConfiguration(customerMybatisConfiguration());

		PathMatchingResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
		customerSqlSessionFactoryBean
				.setMapperLocations(resourceResolver.getResources("classpath*:/mapper/*_mapper.xml"));

		Interceptor[] interceptors = { PaginationInterceptor.getInstance() };
		customerSqlSessionFactoryBean.setPlugins(interceptors);

		return customerSqlSessionFactoryBean;
	}
}
