package com.lzh.springboot_redis.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RedisUtilTest {
    @Autowired
    RedisUtil util;
    @Test
    void set() {
        util.set("test","test",60);
    }
}