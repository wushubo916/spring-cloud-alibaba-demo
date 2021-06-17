package com.alibaba.order.feign.fallback;

import com.alibaba.order.feign.CreditService;
import org.springframework.stereotype.Component;

/**
 * @program: spring-cloud-alibaba-demo
 * @description:
 * @author: Mr.Wu
 * @create: 2021-05-13 15:59
 **/
@Component
public class CreditServiceFallback implements CreditService {
    @Override
    public String addCredit(Long userId, Integer creditCount) {
        //TODO 记录降级日志，后续自动补偿
        System.out.println("调用加积分服务失败，记录日志降级处理：userId=" + userId + ",creditCount=" + creditCount);
        return "error";
    }
}
