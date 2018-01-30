package com.dber.customer.api.entity;

import lombok.Data;

/**
 * <li>文件名称: ShopVipCardCustomer.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class ShopVipCardCustomer {
	
	/**
	 * 
	 */
	private Long id;

	/**
	 * 
	 */
	private Integer shopId;

	/**
	 * 
	 */
	private Integer shopVipCardId;

	/**
	 * 
	 */
	private Integer customerId;

	/**
	 * 从第一次激活开始，总共可使用的天数
	 */
	private Integer days;

	/**
	 * 
	 */
	private Double price;

	/**
	 * 状态：
1-新购;
2-启用（激活）;
3-转让中（期间不可年卡消费，可取消转让，但暂停累计的天数会重新累积）;
4-已转让;
5-已过期;
	 */
	private Integer status;

	/**
	 * 
	 */
	private String shopName;

	/**
	 * 
	 */
	private String customerName;

	/**
	 * 
	 */
	private String cardName;

	/**
	 * 第一次激活时间
	 */
	private java.sql.Date activeDate;

	/**
	 * 卡最近一次转让时间
	 */
	private java.sql.Date transferDate;

	/**
	 * 
	 */
	private java.sql.Date createTime;

	/**
	 * 
	 */
	private java.sql.Timestamp modifyTime;


}
