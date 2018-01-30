package com.dber.customer.api.entity;

import lombok.Data;

/**
 * <li>文件名称: ShopFocus.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class ShopFocus {
	
	/**
	 * 
	 */
	private Long id;

	/**
	 * 
	 */
	private Integer customerId;

	/**
	 * 
	 */
	private Integer shopId;

	/**
	 * 
	 */
	private String customerName;

	/**
	 * 
	 */
	private String shopName;

	/**
	 * 
	 */
	private java.sql.Date createTime;


}
