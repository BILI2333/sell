package com.imooc.sell;

import org.apache.juli.logging.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class LoggerTest {
    //{}前要加空格，才能输出

    @Test
    public void test1(){
        String name  = "imooc";
        String password = "123456";
        log.debug("debug.......");
        log.info("info...");
        log.info("name: {},password: {}",name,password);
        log.error("error....");
    }
}
