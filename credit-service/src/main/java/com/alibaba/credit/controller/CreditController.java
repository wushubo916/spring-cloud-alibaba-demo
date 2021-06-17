package com.alibaba.credit.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @program: spring-cloud-alibaba-demo
 * @description: 订单服务类
 * @author: Mr.Wu
 * @create: 2021-05-12 13:56
 **/

@RestController
@RequestMapping("/credit")
public class CreditController {

    @GetMapping(value = "/add/{userId}/{creditCount}")
    public String addCredit(@PathVariable(value = "userId") Long userId, @PathVariable(value = "creditCount") Integer creditCount){
        System.out.println("用户userId=" + userId + ": 增加" + creditCount + "积分完成");
        return "success";
    }
}
