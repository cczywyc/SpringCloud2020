package com.shterm.springcloud.controller;

import com.shterm.springcloud.entities.CommonResult;
import com.shterm.springcloud.entities.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 订单模块控制层
 * @author wangyc
 */
@RestController
public class OrderController {
    /** 日志记录 */
    private static Logger log = LoggerFactory.getLogger(OrderController.class);
    /** RestTemplate */
    @Resource
    private RestTemplate restTemplate;
    /** 服务提供者url */
    //private static final String PAYMENT_URL = "http://localhost:8001";
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    /**
     * 新增
     * @param payment 实体
     * @return 结果集
     */
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    /**
     * 查询
     * @param id 查询的id
     * @return 结果集
     */
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
