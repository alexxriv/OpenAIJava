package com.vaysai.openaijava.configuration;


import com.vaysai.openaijava.client.FeignClientInterceptor;
import com.vaysai.openaijava.client.OpenAIClient;
import com.vaysai.openaijava.proxy.OpenAIClientProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableFeignClients(clients = OpenAIClient.class)
@ComponentScan(basePackageClasses = {OpenAIClientProxy.class, FeignClientInterceptor.class})
@Configuration
@PropertySource(value = "classpath:openAIJava-application.yaml", factory = YamlPropertySourceFactory.class)
public class OpenAIClientConfiguration {
}