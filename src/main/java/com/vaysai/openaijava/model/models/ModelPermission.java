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
    private Boolean allowCreateEngine;

    @JsonProperty("allow_sampling")
    private Boolean allowSampling;

    @JsonProperty("allow_logprobs")
    private Boolean allowLogprobs;

    @JsonProperty("allow_search_indices")
    private Boolean allowSearchIndices;

    @JsonProperty("allow_view")
    private Boolean allowView;

    @JsonProperty("allow_fine_tunning")
    private Boolean allowFineTunning;

    private String organization;
    private String group;

    @JsonProperty("is_blocking")
    private Boolean isBlocking;
}
