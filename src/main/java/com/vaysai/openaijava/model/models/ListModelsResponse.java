package com.vaysai.openaijava.model.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class ListModelsResponse {
    private List<Data> data;
    private String object;
}
