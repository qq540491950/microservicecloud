package com.lirt.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: lirt
 * @Description:
 * @Date: Created in 23:18 2019/4/30
 */
@Configuration
public class MyConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule() {
//        return new RandomRule();
//    }
}
