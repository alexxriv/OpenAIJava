package com.vaysai.openaijava.model.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;


@Builder
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {
    private String id;
    private String object;
    private String created;
    private String owned_by;
    private List<ModelPermission> permission;

    //This two params missing in openAI docs 11-12-2022
    private String root;
    private String parent;
}


/*
{
  "id": "text-davinci-003",
  "object": "model",
  "created": 1669599635,
  "owned_by": "openai-internal",
  "permission": [
    {
        ...
    }
  ],
  "root": "text-davinci-003",
  "parent": null
}

 */