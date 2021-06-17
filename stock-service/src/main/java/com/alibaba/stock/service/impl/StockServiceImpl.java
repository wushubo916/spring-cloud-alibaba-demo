package com.alibaba.stock.service.impl;

import com.alibaba.stock.service.StockService;
import org.springframework.stereotype.Service;

/**
 * @program: spring-cloud-alibaba-demo
 * @description: 库存服务接口实现类
 * @author: Mr.Wu
 * @create: 2021-05-12 13:49
 **/
@Service
public class StockServiceImpl implements StockService {

    @Override
    public String deductStock(Long productId, Integer stockCount) {
        System.out.println("商品productId=" + productId + ": " + "扣减库存" + stockCount);
        return "success";
    }
}
