package com.hu.springcloud.service;

import com.hu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentService
 * @Description
 * @Author us
 * @Date 2020/4/11 16:05
 * @Version 1.0
 **/
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
