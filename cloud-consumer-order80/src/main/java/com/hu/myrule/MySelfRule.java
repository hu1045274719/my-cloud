package com.hu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRule
 * @Description
 * @Author us
 * @Date 2020/4/12 18:56
 * @Version 1.0
 **/
@Configuration
public class MySelfRule {

    public IRule myRule(){
        return new RandomRule(); //定义随机
    }
}
