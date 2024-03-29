package com.dber.customer.api;

import com.dber.base.AbstractClient;
import com.dber.base.enums.DberSystem;
import com.dber.base.result.Result;
import org.springframework.stereotype.Service;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
@Service
public class CustomerClient extends AbstractClient implements ICustomerClient{
    public CustomerClient(){
        super(DberSystem.CUSTOMER);
    }

    public Result<String> test() {
        return clientUtil.get("/api/test");
    }
}
