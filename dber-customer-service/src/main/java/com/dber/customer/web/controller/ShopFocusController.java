package com.dber.customer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dber.base.service.IService;
import com.dber.base.web.controller.AbstractController;
import com.dber.customer.api.entity.ShopFocus;
import com.dber.customer.service.IShopFocusService;

/**
 * <li>文件名称: ShopFocusController.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月21日
 * @author dev-v
 */
@RestController
@RequestMapping("/shop_focus")
public class ShopFocusController extends AbstractController<ShopFocus> {

	@Autowired
	private IShopFocusService service;

	@Override
	protected IService<ShopFocus> getService() {
		return this.service;
	}
}
