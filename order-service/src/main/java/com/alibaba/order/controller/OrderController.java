package com.alibaba.order.controller;

import com.alibaba.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: spring-cloud-alibaba-demo
 * @description: 订单服务类
 * @author: Mr.Wu
 * @create: 2021-05-12 13:56
 **/

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OrderService orderService;

    @GetMapping("/stock/deduct")
    public String deductStock(@RequestParam("productId") Long productId, @RequestParam("stockCount") Integer stockCount){
        return this.restTemplate.getForObject("http://stock-service/stock/deduct/" + productId + "/" + stockCount, String.class);
    }

    @GetMapping("/create")
    public String createOrder(@RequestParam("productId") Long productId,
                              @RequestParam("userId") Long userId,
                              @RequestParam("stockCount") Integer stockCount,
                              @RequestParam("creditCount") Integer creditCount){
        //TODO redis计数器进行限流
        orderService.createOrder(productId, userId, stockCount, creditCount);
        return "success";
    }
}
