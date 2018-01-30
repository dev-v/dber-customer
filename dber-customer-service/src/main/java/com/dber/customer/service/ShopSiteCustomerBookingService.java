package com.dber.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dber.base.mapper.IMapper;
import com.dber.base.service.AbstractService;
import com.dber.customer.api.entity.ShopSiteCustomerBooking;
import com.dber.customer.mapper.IShopSiteCustomerBookingMapper;

/**
 * <li>文件名称: ShopSiteCustomerBookingService.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Service
public class ShopSiteCustomerBookingService extends AbstractService<ShopSiteCustomerBooking> implements IShopSiteCustomerBookingService {

	@Autowired
	private IShopSiteCustomerBookingMapper mapper;

	@Override
	protected IMapper<ShopSiteCustomerBooking> getMapper() {
		return this.mapper;
	}

}
