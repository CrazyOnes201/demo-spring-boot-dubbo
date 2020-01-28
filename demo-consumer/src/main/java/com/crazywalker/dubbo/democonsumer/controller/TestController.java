package com.crazywalker.dubbo.democonsumer.controller;

import com.crazywalker.dubbo.demoapi.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *****************************************
 * **        Author : CrazyWalker         **
 * *****************************************
 * *****************************************
 * ** Date: 周二,01/28 2020 5:46 下午 GMT+8**
 * *****************************************
 * *****************************************
 * **     用途: 测试控制层类                **
 * *****************************************
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Reference
    private ProviderService providerService;

    @GetMapping("provider")
    public String provider() {
        return providerService.testMethod("fuck");
    }
}
