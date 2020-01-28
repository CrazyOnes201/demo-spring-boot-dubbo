package com.crazywalker.dubbo.demoprovider.service.impl;

import com.crazywalker.dubbo.demoapi.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;

/**
 * *****************************************
 * **        Author : CrazyWalker         **
 * *****************************************
 * *****************************************
 * ** Date: 周二,01/28 2020 5:15 下午 GMT+8**
 * *****************************************
 * *****************************************
 * **     用途: 生产者业务逻辑接口实现类      **
 * *****************************************
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    public String testMethod(String var) {
        return "test method return value: " + var;
    }
}
