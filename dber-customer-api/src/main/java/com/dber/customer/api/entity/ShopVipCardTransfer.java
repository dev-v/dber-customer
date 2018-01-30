package com.dber.customer.api.entity;

import lombok.Data;

/**
 * <li>文件名称: ShopVipCardTransfer.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class ShopVipCardTransfer {
	
	/**
	 * 使用shop_vip_card_customer的id，表示是其转让过来的
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
	 * 购买人
	 */
	private Integer customerId;

	/**
	 * 
	 */
	private String shopName;

	/**
	 * 
	 */
	private String cardName;

	/**
	 * 
	 */
	private String customerName;

	/**
	 * 剩余可用天数
	 */
	private Integer days;

	/**
	 * 转让价格
	 */
	private Double price;

	/**
	 * 状态：1-转让中，2-已转让（已购买），3-启用（激活消费中）、4-已过期、5-取消转让（或直接删除）
	 */
	private Integer status;

	/**
	 * 
	 */
	private java.sql.Date createTime;

	/**
	 * 
	 */
	private java.sql.Timestamp modifyTime;


}
