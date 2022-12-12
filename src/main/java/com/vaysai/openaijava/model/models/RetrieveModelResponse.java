package com.vaysai.openaijava.model.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetrieveModelResponse {

    private String id;
    private String object;

    @JsonProperty("owned_by")
    private String ownedBy;

    @JsonProperty("permission")
    private List<ModelPermission> modelPermissions;

    private String root;
    private String parent;
}