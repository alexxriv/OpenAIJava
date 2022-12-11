package com.vaysai.openaijava.model.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    private String id;
    private String object;
    private String owned_by;
    private String permission;
}
