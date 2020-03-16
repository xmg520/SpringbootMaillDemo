package com.horse.demomail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class DemomailApplicationTests {

    @Test
    void contextLoads() {
        Integer code=new Random().nextInt(500);
        System.out.println(code);
    }

}
