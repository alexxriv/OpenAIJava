package com.vaysai.openaijava.model.files;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UploadFilesResponse {
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
  "id": "file-XjGxS3KTG0uNmNOK362iJua3",
  "object": "file",
  "bytes": 140,
  "created_at": 1613779121,
  "filename": "mydata.jsonl",
  "purpose": "fine-tune"
}

 */
