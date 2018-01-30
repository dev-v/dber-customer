package com.dber.customer.web.controller;

import com.dber.base.login.LoginCheckController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dber.customer.service.ICustomerService;

/**
 * <li>文件名称: CustomerController.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月21日
 * @author dev-v
 */
@RestController
@RequestMapping("/customer")
public class CustomerController extends LoginCheckController {

	@Autowired
	private ICustomerService service;

}
