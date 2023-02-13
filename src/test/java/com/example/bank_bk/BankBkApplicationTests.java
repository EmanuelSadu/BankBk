package com.example.bank_bk;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EntityScan("com.example.bank_bk.domain.model")
@SpringBootTest(classes = BankBkApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BankBkApplicationTests {

    @Test
    void contextLoads() {
    }

}
