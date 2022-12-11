package com.vaysai.openaijava.client;

import com.vaysai.openaijava.model.request.completion.CompletionRequest;
import com.vaysai.openaijava.model.request.edits.EditsRequest;
import com.vaysai.openaijava.model.response.completions.CompletionResponse;
import com.vaysai.openaijava.model.response.edits.EditsResponse;
import com.vaysai.openaijava.model.response.models.ModelsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "openAIApi", url = "${openAIApi.url}", configuration = OpenAIFeignConfig.class)
public interface OpenAIClient {

    @GetMapping(value = "/models", consumes = "application/json")
    ModelsResponse getModels();

    @PostMapping(value = "/completions", consumes = "application/json")
    CompletionResponse postCompletions(CompletionRequest completionRequest);

    @PostMapping(value="/edits", consumes = "application/json")
    EditsResponse postEdits(EditsRequest editsRequest);

    @PostMapping(value="/images/generations",consumes = "application/json")
    CreateImageResponse createImageGenerations(CreateImageRequest createImageReques);

    @PostMapping(value="/images/edits",consumes = "application/json")
    CreateImageEditsResponse createImageEdits(CreateImageEditsRequest createImageEditsRequest);

    @PostMapping(value="/images/variations",consumes = "application/json")
    CreateImageVariationsResponse createdImageVariations(CreateImageVariationsRequest createdImageVariationsRequest);

    @PostMapping(value="embeddings",consumes = "application/json")
    CreateEmbeddingsResponse createEmbeddings(CreateEmbeddingsRequest createEmbeddingsRequest);

    @PostMapping(value="moderations",consumes = "application/json")
    CreateModerationsResponse createModerations(CreateModerationsRequest createModerationsRequest);
}
