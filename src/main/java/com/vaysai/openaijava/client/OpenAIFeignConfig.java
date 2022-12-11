package com.vaysai.openaijava.client;


import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAIFeignConfig {

    @Value("${openAI.ApiKey}")
    private String openAIApiKey;

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> requestTemplate.header("Authorization", "Bearer " + openAIApiKey);

    }
}