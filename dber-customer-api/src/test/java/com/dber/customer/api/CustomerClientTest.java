package com.dber.customer.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CustomerClient.class)
public class CustomerClientTest {

    @Autowired
    private CustomerClient client;

    @Test
    public void test(){
        System.out.println(client.test());
    }
}
