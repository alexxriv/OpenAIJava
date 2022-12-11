package com.vaysai.openaijava.model.response.files;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ListFilesResponse {
    List<File> data;
    private String object;
}


/*
{
  "data": [
    {
      "id": "file-ccdDZrC3iZVNiQVeEA6Z66wf",
      "object": "file",
      "bytes": 175,
      "created_at": 1613677385,
      "filename": "train.jsonl",
      "purpose": "search"
    },
    {
      "id": "file-XjGxS3KTG0uNmNOK362iJua3",
      "object": "file",
      "bytes": 140,
      "created_at": 1613779121,
      "filename": "puppy.jsonl",
      "purpose": "search"
    }
  ],
  "object": "list"
}
 */