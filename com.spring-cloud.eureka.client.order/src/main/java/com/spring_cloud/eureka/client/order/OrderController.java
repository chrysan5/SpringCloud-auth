package com.spring_cloud.eureka.client.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping
    public String getOrder() {
        return "Order details";
    }
}
//orderController에서 product service를 호출하지 않는 구조로 바뀜