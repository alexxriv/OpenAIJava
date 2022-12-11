package com.vaysai.openaijava.model.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RetrieveModelResponse {
    private String id;
    private String object;
    private String owned_by;
    private ModelPermission modelPermission;
}

/*
{
  "id": "text-davinci-003",
  "object": "model",
  "owned_by": "openai",
  "permission": [...]
}

 */