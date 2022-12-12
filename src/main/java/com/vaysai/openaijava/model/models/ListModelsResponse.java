package com.vaysai.openaijava.model.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListModelsResponse {
    //order was wrong in openAI docs 11-12-2022

    private String object;
    private List<Model> data;
}
