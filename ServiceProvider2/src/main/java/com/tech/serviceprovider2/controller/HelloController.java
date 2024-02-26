package com.tech.serviceprovider2.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloWorld(HttpServletRequest request) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        return "Hello World from Service Provider: instance-2" + "\n + IP: " + localHost.getHostAddress();
    }
    @PostMapping("/hello")
    public String helloWorld2(HttpServletRequest request) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        return "abc";
    }

    @RequestMapping("/echo")
    public String echo(@RequestParam("text") String text){
        return "Hello, you just input: " + text;
    }
}