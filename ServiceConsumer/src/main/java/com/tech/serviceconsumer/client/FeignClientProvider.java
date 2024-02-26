package com.tech.serviceconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ServiceProvider")  // 长连接，name表明调用service provider1的API是下面的样子
public interface FeignClientProvider {
    /**
     * Define ServiceProvider Interface
     * Parameters: Match with Provider
     * Signature: Not required for match
     * Return: Match with Provider
     * URL: Match with Provider path
     */
    @GetMapping("/hello")
    public String helloWorld();
    @RequestMapping("/echo")
    public String echo(@RequestParam("text") String text);
}
