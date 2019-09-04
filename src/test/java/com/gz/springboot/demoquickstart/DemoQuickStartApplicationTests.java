package com.gz.springboot.demoquickstart;

import com.gz.springboot.demoquickstart.bean.person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class   DemoQuickStartApplicationTests {
    @Autowired
    person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
