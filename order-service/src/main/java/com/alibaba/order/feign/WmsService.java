package com.alibaba.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: spring-cloud-alibaba-demo
 * @description:
 * @author: Mr.Wu
 * @create: 2021-05-13 11:24
 **/
@FeignClient(value = "wms-service")
public interface WmsService {

    @GetMapping(value = "/wms/delivery/{userId}/{productId}")
    String delivery(@PathVariable(value = "userId") Long userId, @PathVariable(value = "productId") Long productId);
}
