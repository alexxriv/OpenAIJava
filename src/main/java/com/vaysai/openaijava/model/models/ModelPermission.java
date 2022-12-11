package com.vaysai.openaijava.model.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelPermission {
    private String id;
    private String object;
    private String created;
    private String allow_create_engine;
    private String allow_sampling;
    private String allow_logprobs;
    private String allow_search_indices;
    private String allow_view;
    private String allow_fine_tunning;
    private String organization;
    private String group;
    private String is_blocking;
}


/*
    {
      "id": "modelperm-Example",
      "object": "model_permission",
      "created": 1670634735,
      "allow_create_engine": false,
      "allow_sampling": true,
      "allow_logprobs": true,
      "allow_search_indices": false,
      "allow_view": true,
      "allow_fine_tuning": false,
      "organization": "*",
      "group": null,
      "is_blocking": false
    }
 */