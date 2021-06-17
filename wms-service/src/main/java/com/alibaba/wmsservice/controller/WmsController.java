package com.alibaba.wmsservice.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @program: spring-cloud-alibaba-demo
 * @description: 订单服务类
 * @author: Mr.Wu
 * @create: 2021-05-12 13:56
 **/

@RestController
@RequestMapping("/wms")
public class WmsController {

    @GetMapping(value = "/delivery/{userId}/{productId}")
    public String addCredit(@PathVariable(value = "userId") Long userId, @PathVariable(value = "productId") Long productId){
        System.out.println("用户userId=" + userId + "的商品productId=" +  productId + ": 生成发货单");
        return "success";
    }

}
