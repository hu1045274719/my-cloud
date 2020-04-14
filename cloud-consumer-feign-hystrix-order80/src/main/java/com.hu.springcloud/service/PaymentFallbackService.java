package com.hu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author hunan
 * @Description 
 * @Date 19:47 2020/4/14
 * @Param 
 * @return 
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
