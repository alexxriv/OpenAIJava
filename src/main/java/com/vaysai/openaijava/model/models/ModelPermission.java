package com.vaysai.openaijava.model.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModelPermission {
    private String id;
    private String object;
    private String created;

    @JsonProperty("allow_create_engine")
    private String allowCreateEngine;

    @JsonProperty("allow_sampling")
    private String allowSampling;

    @JsonProperty("allow_logprobs")
    private String allowLogprobs;

    @JsonProperty("allow_search_indices")
    private String allowSearchIndices;

    @JsonProperty("allow_view")
    private String allowView;

    @JsonProperty("allow_fine_tunning")
    private String allowFineTunning;

    private String organization;
    private String group;

    @JsonProperty("is_blocking")
    private String isBlocking;
}
