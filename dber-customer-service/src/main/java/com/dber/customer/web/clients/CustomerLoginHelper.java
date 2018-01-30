package com.dber.customer.web.clients;

import com.dber.base.entity.Account;
import com.dber.customer.api.entity.Customer;
import com.dber.customer.service.ICustomerService;
import com.dber.plat.api.PlatLoginHelper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/30
 */
public class CustomerLoginHelper extends PlatLoginHelper {

    @Autowired
    ICustomerService customerService;

    @Override
    protected void addAccount(Account account) {
        Customer customer = new Customer();
        customer.setId(account.getId());
        customerService.save(customer);
    }
}
