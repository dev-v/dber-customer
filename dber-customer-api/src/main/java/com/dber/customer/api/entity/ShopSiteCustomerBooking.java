package com.dber.customer.api.entity;

import lombok.Data;

/**
 * <li>文件名称: ShopSiteCustomerBooking.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class ShopSiteCustomerBooking {
	
	/**
	 * 
	 */
	private Long id;

	/**
	 * 
	 */
	private Integer shopId;

	/**
	 * 订场号
	 */
	private Long siteBookingId;

	/**
	 * 
	 */
	private Long siteId;

	/**
	 * 顾客订场用户id
	 */
	private Integer customerId;

	/**
	 * 
	 */
	private Integer shopServiceId;

	/**
	 * 1-新建（待支付，客户端缓存，可提交或直接支付）；
2-待支付（已提交，服务端存储）；
3-未支付过期（每天检查一次）；
4-未支付取消；
5-待消费（已付款）；
6-已取消；
7-已消费；
	 */
	private Integer status;

	/**
	 * 
	 */
	private String shopName;

	/**
	 * 
	 */
	private String serviceName;

	/**
	 * 场馆名称冗余
	 */
	private String siteName;

	/**
	 * 顾客订场用户姓名（或昵称）
	 */
	private String customerName;

	/**
	 * 顾客订场用户电话
	 */
	private String customerCellphone;

	/**
	 * 场地预订事项描述 或 需求描述
	 */
	private String content;

	/**
	 * 订场价格
	 */
	private Double price;

	/**
	 * 
	 */
	private java.sql.Date bookingDate;

	/**
	 * 
	 */
	private Integer timeBegin;

	/**
	 * 
	 */
	private Integer timeEnd;

	/**
	 * 
	 */
	private java.sql.Date createTime;

	/**
	 * 
	 */
	private java.sql.Timestamp modifyTime;


}
