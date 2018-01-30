package com.dber.customer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dber.base.service.IService;
import com.dber.base.web.controller.AbstractController;
import com.dber.customer.api.entity.ShopSiteCustomerBooking;
import com.dber.customer.service.IShopSiteCustomerBookingService;

/**
 * <li>文件名称: ShopSiteCustomerBookingController.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月21日
 * @author dev-v
 */
@RestController
@RequestMapping("/shop_site_customer_booking")
public class ShopSiteCustomerBookingController extends AbstractController<ShopSiteCustomerBooking> {

	@Autowired
	private IShopSiteCustomerBookingService service;

	@Override
	protected IService<ShopSiteCustomerBooking> getService() {
		return this.service;
	}
}
