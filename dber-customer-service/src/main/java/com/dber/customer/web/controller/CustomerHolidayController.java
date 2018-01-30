package com.dber.customer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dber.base.service.IService;
import com.dber.base.web.controller.AbstractController;
import com.dber.customer.api.entity.CustomerHoliday;
import com.dber.customer.service.ICustomerHolidayService;

/**
 * <li>文件名称: CustomerHolidayController.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月21日
 * @author dev-v
 */
@RestController
@RequestMapping("/customer_holiday")
public class CustomerHolidayController extends AbstractController<CustomerHoliday> {

	@Autowired
	private ICustomerHolidayService service;

	@Override
	protected IService<CustomerHoliday> getService() {
		return this.service;
	}
}
