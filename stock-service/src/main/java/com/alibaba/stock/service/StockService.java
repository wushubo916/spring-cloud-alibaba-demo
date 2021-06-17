package com.alibaba.stock.service;

import org.springframework.stereotype.Service;

/**
 * @program: spring-cloud-alibaba-demo
 * @description: 库存服务接口类
 * @author: Mr.Wu
 * @create: 2021-05-12 13:49
 **/
public interface StockService {

    /**
     * 扣减库存
     *
     * @param productId
     * @param stockCount
     * @return
     */
    String deductStock(Long productId, Integer stockCount);
}
