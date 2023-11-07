package com.baomidou.mybatisplus.samples.pagination.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MapperConfig {

    @Bean
    public ResultTypeInterceptor resultTypeInterceptor(){
        return new ResultTypeInterceptor();
    }
}
