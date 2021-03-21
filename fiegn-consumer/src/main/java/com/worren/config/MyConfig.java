package com.worren.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.worren.rules.RandomRule_ZY;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public IRule myRule() {
        return new RandomRule_ZY();
    }
}
