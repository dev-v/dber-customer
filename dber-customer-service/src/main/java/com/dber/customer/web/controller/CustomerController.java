package com.dber.customer.web.controller;

import com.dber.base.entity.Response;
import com.dber.base.login.LoginCheckController;
import com.dber.customer.api.entity.Customer;
import com.dber.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <li>文件名称: CustomerController.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2017年12月21日
 */
@RestController
@RequestMapping("/customer")
public class CustomerController extends LoginCheckController {

    @Autowired
    private ICustomerService service;

    @RequestMapping("/get")
    public Response<Customer> get() {
        return Response.newSuccessResponse(service.get(getAccountId()));
    }

}
