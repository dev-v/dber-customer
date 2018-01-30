package com.dber.customer.web.controller;

import com.dber.base.login.LoginCheckController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class CustomerHolidayController extends LoginCheckController {

	@Autowired
	private ICustomerHolidayService service;

}
