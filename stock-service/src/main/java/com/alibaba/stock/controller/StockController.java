package com.alibaba.stock.controller;

import com.alibaba.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Registration;
import java.rmi.registry.Registry;

/**
 * @program: spring-cloud-alibaba-demo
 * @description:
 * @author: Mr.Wu
 * @create: 2021-05-12 13:44
 **/

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;
    //@Autowired
    //private Registration registration;

    @RequestMapping(value = "/deduct/{productId}/{stockCount}")
    public String deductStock(@PathVariable("productId") Long productId, @PathVariable("stockCount") Integer stockCount){
        return stockService.deductStock(productId, stockCount);
    }

    @GetMapping("/getIpAndPort")
    public String getIpAndPort(){
        return "";
    }
}
