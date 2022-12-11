package com.vaysai.openaijava.model.response.files;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class File {
    private String id;
    private String object;
    private String bytes;
    private String created_at;
    private String filename;
    private String purpose;
}

/*
    {
      "id": "file-ccdDZrC3iZVNiQVeEA6Z66wf",
      "object": "file",
      "bytes": 175,
      "created_at": 1613677385,
      "filename": "train.jsonl",
      "purpose": "search"
    },
 */