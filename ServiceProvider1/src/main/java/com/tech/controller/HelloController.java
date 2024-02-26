package com.tech.controller;

import com.tech.serviceconsumer.client.ProviderFeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    ProviderFeignClient providerFeignClient;
    @RequestMapping("/helloConsumer")
    public String helloWorld()
    {
        return providerFeignClient.helloWorld();
    }
    @RequestMapping("/echoConsumer")
    public String echoConsumer(@RequestParam("text") String text)
    {
        return providerFeignClient.echo(text);
    }
}