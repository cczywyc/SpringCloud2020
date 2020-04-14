package com.shterm.springcloud.service;

import com.shterm.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 支付模块服务类
 * author: wangyc
 */
public interface PaymentService {
    /**
     * 新增操作
     * @param payment 实体
     * @return 新增编号
     */
    int create(Payment payment);

    /**
     * 根据id查询
     * @param id 查询id
     * @return 查询结果实体
     */
    Payment getPaymentById(@Param("id") Long id);
}
