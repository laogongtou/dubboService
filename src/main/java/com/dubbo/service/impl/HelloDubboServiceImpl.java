package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.HelloDubboService;
/**
 * @Auther: GongBo
 * @Time:2018年12月26日 18:58:04
 * @Description：Dubbo测试service实现类
 */
@Service
public class HelloDubboServiceImpl implements HelloDubboService {

    @Override
    public String testDubbo() {
        System.out.println("-------------------dubbo消费者开始调用----------------");
        return "hello Dubbo";
    }
}
