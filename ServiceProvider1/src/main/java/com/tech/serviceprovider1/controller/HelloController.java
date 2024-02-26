package com.tech.serviceprovider1.controller;

import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld(HttpServletRequest request) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        return "Hello World from Service Provider: instance-1" + "\n + IP: " + localHost.getHostAddress();
    }
    @PostMapping("/hello")
    public String helloWorld2(HttpServletRequest request) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        return "abc";
    }

    @RequestMapping("/echo")
    public String echo(@RequestParam("text") String text){
        // 测试 http://localhost:8003/echoConsumer?text=123
        return "Hello, you just input: " + text;
    }
}