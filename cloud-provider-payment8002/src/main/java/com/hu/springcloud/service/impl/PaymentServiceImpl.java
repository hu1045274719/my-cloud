package com.hu.springcloud.service.impl;

import com.hu.springcloud.dao.PaymentDao;
import com.hu.springcloud.entities.Payment;
import com.hu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description
 * @Author us
 * @Date 2020/4/11 16:06
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

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
