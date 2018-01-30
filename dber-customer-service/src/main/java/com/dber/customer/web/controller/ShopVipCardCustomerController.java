package com.dber.customer.web.controller;

import com.dber.base.login.LoginCheckController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dber.base.service.IService;
import com.dber.customer.api.entity.ShopVipCardCustomer;
import com.dber.customer.service.IShopVipCardCustomerService;

/**
 * <li>文件名称: ShopVipCardCustomerController.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月21日
 * @author dev-v
 */
@RestController
@RequestMapping("/shop_vip_card_customer")
public class ShopVipCardCustomerController extends LoginCheckController {

	@Autowired
	private IShopVipCardCustomerService service;

}
