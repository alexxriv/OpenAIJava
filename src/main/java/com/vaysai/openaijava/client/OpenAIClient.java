package com.vaysai.openaijava.client;

import com.vaysai.openaijava.model.request.completion.CompletionRequest;
import com.vaysai.openaijava.model.response.completion.CompletionResponse;
import com.vaysai.openaijava.model.response.models.ModelsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "openAIApi", url = "${openAIApi.url}", configuration = OpenAIFeignConfig.class)
public interface OpenAIClient {

    @GetMapping(value = "/models", consumes = "application/json")
    ModelsResponse getModels();

    @PostMapping(value = "/completions", consumes = "application/json")
    CompletionResponse postCompletion(CompletionRequest completionRequest);
}