package com.alibaba.order.service;

import com.alibaba.order.feign.CreditService;
import com.alibaba.order.feign.StockService;
import com.alibaba.order.feign.WmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: spring-cloud-alibaba-demo
 * @description: 订单接口实现类
 * @author: Mr.Wu
 * @create: 2021-05-13 11:19
 **/
@Service
public class OrderService {

    @Autowired
    private StockService stockService;
    @Autowired
    private CreditService creditService;
    @Autowired
    private WmsService wmsService;

    //@Transactional
    public String createOrder(Long productId, Long userId, Integer stockCount, Integer creditCount) {
        System.out.println("创建订单成功！");
        stockService.deductStock(productId, stockCount);
        creditService.addCredit(userId, creditCount);
        wmsService.delivery(userId, productId);
        return "success";
    }
}
