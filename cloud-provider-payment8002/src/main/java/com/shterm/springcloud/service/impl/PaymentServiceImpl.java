package com.shterm.springcloud.service.impl;

import com.shterm.springcloud.dao.PaymentDao;
import com.shterm.springcloud.entities.Payment;
import com.shterm.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 支付模块服务类实现类
 * author: wangyc
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    /** dao层接口 */
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
