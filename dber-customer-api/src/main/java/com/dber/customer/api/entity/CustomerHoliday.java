package com.dber.customer.api.entity;

import lombok.Data;

/**
 * <li>文件名称: CustomerHoliday.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class CustomerHoliday {
	
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private Integer customerId;

	/**
	 * 
	 */
	private java.sql.Date date;

	/**
	 * 
	 */
	private java.sql.Timestamp modifyTime;


}
