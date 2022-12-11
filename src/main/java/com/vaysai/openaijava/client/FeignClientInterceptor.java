package com.vaysai.openaijava.client;


import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FeignClientInterceptor implements RequestInterceptor {

    @Value("${openAI.api.key}")
    private final String openAIApiKey;


    public FeignClientInterceptor(@Value("${openAI.api.key}") String openAIApiKey){
        this.openAIApiKey = openAIApiKey;
    }


    private static final String AUTHORIZATION_HEADER="Authorization";
    private static final String TOKEN_TYPE = "Bearer";

    @Override
    public void apply(RequestTemplate requestTemplate) {
            requestTemplate.header(AUTHORIZATION_HEADER, String.format("%s %s", TOKEN_TYPE, openAIApiKey));
    }
}