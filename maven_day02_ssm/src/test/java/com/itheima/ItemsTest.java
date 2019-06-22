package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void daoTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = applicationContext.getBean("itemsDao", ItemsDao.class);
        Items byId = itemsDao.findById(1);
        System.out.println(byId);
    }

    @Test
    public void serviceTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = applicationContext.getBean("itemsServiceImpl", ItemsService.class);
        Items items = itemsService.feinById(1);
        System.out.println(items);
    }
}
