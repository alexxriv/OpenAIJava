package com.vaysai.openaijava.model.files;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class File {
    private String id;
    private String object;
    private String bytes;

    @ToString.Include(name="created_at")
    private String createdAt;
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