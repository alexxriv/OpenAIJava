package com.vaysai.openaijava.model.finetunes;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteFineTuneModelResponse {

    private String id;
    private String object;
    private String deleted;
}


/*
{
  "id": "curie:ft-data",
  "object": "model",
  "deleted": true
}

 */