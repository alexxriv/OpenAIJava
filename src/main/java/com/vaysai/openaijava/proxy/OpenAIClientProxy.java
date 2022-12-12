package com.vaysai.openaijava.proxy;

import com.vaysai.openaijava.client.OpenAIClient;
import com.vaysai.openaijava.model.OpenAIClientResponse;
import com.vaysai.openaijava.model.models.ListModelsResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Log4j2
public class OpenAIClientProxy {

    private final OpenAIClient openAIClient;

    public OpenAIClientResponse<ListModelsResponse> getModels() {
        ListModelsResponse response;
        try {
            response = openAIClient.listModels();
        } catch (Exception exception) {
            return getErrorResponse(exception.getMessage());
        }

        if (response == null) {
            return getErrorResponse("ModelsResponse returned null response!");
        }

        log.info("getModels() request received. Response: {}", response);

        return OpenAIClientResponse.<ListModelsResponse>builder()
                .data(response)
                .build();
    }

    private OpenAIClientResponse<ListModelsResponse> getErrorResponse(String errorDescription) {
        log.info("getModels request received but an error occurred. Error: {}", errorDescription);

        return OpenAIClientResponse.<ListModelsResponse>builder()
                .error(true)
                .errorDescription(errorDescription)
                .build();
    }
}
