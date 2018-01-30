package com.dber.customer.api.entity;

import lombok.Data;

/**
 * <li>文件名称: Customer.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class Customer {
	
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 当前级别
	 */
	private Integer elementMedalId;

	/**
	 * 用户状态：
1-暂停消费
2-激活消费
	 */
	private Integer status;

	/**
	 * 
	 */
	private Integer holidayCount;

	/**
	 * 健身次数
	 */
	private Integer fitnessCount;

	/**
	 * 积分：通过健身次数、消费私教课程获得
	 */
	private Integer score;

	/**
	 * 
	 */
	private java.sql.Date createTime;

	/**
	 * 
	 */
	private java.sql.Timestamp modifyTime;


}
