package com.example.redisstudy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisUtilTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void set() {
        redisUtil.set("test","testvalue");
    }

    @Test
    public void get() {
        String value = redisUtil.get("hello");
        Assert.assertNotNull(value);
    }
}