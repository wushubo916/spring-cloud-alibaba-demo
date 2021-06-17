package com.alibaba.order.feign;

import com.alibaba.order.feign.fallback.CreditServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: spring-cloud-alibaba-demo
 * @description:
 * @author: Mr.Wu
 * @create: 2021-05-13 11:24
 **/
@FeignClient(value = "credit-service", fallback = CreditServiceFallback.class)
public interface CreditService {

    @GetMapping(value = "/credit/add/{userId}/{creditCount}")
    String addCredit(@PathVariable(value = "userId") Long userId, @PathVariable(value = "creditCount") Integer creditCount);
}
