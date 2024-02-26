package com.tech.serviceconsumer.controller;

import com.tech.serviceconsumer.client.FeignClientProvider;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@RestController
public class HelloController {
    /*
     * 当用户访问hello consumer时，通过feign client调用RPC，
     * feign去consul上找service provider的程序，返回里面hello world的返回值
     */
    @Resource
    FeignClientProvider providerFeignClient;

    @GetMapping("/helloConsumer")
    public String helloWorld() {
        return providerFeignClient.helloWorld();
    }

    @RequestMapping("/echoConsumer")
    public String echoConsumer(@RequestParam("text") String text) {
        return providerFeignClient.echo(text);
    }
}