package com.jdd.distributedData.dubbo.consumer.controller;

import com.jdd.distributedData.dubbo.provider.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {

    @DubboReference(version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:9080",
             timeout = 1000,
            methods = {
                    @Method(name = "sayHello", timeout = 300)
            })
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return demoService.sayHello(name);
    }
}
