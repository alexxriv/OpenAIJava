package com.vaysai.openaijava.model.embeddings;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Usage {
    @JsonProperty("prompt_tokens")
    private String promptTokens;
    @JsonProperty("total_tokens")
    private String totalTokens;
}
