package com.hu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author hunan
 * @Description 
 * @Date 20:32 2020/4/15
 * @Param
 * @return 
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001
{
    public static void main(String[] args) {
            SpringApplication.run(HystrixDashboardMain9001.class, args);
    }
}
