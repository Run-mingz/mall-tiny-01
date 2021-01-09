package com.macro.mall.tiny;

import com.macro.mall.tiny.controller.PmsBrandController;
import com.macro.mall.tiny.service.PmsBrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallTinyApplicationTests {

    @Autowired
    private PmsBrandService demoService;

    @Test
    public void contextLoads() {
        demoService.listAllBrand();
    }

    @Test
    public void test1() {
        demoService.listBrand(1,1);
    }
}
