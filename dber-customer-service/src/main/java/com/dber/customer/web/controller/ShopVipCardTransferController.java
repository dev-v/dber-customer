package com.dber.customer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dber.base.service.IService;
import com.dber.base.web.controller.AbstractController;
import com.dber.customer.api.entity.ShopVipCardTransfer;
import com.dber.customer.service.IShopVipCardTransferService;

/**
 * <li>文件名称: ShopVipCardTransferController.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月21日
 * @author dev-v
 */
@RestController
@RequestMapping("/shop_vip_card_transfer")
public class ShopVipCardTransferController extends AbstractController<ShopVipCardTransfer> {

	@Autowired
	private IShopVipCardTransferService service;

	@Override
	protected IService<ShopVipCardTransfer> getService() {
		return this.service;
	}
}
