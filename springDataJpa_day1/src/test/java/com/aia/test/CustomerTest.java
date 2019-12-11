package com.aia.test;

import com.aia.dao.CustomerDao;
import com.aia.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)//声明spring提供的单元测试环境
@ContextConfiguration(locations = "classpath:applicationContext.xml")//指定spring容器的配置信息
public class CustomerTest {
    @Autowired
    private CustomerDao customerDao;
    @Test
    public void testFindOne(){
       Customer customer = customerDao.findOne(1l);
       System.out.println(customer);
    }

    @Test
    public void testFindAll(){
        List<Customer> list = customerDao.findAll();
        for (Customer obj:list) {
            System.out.println(obj);
        }
    }
}
