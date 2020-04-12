package com.shterm.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangyc
 */
@Configuration
public class ApplicationContextConfig {
    /**
     * RestTemplate
     * @return RestTemplate
     */
    @Bean
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
