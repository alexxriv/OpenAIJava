package com.vaysai.openaijava.model.response.files;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeleteFileResponse {
    private String id;
    private String object;
    private String deleted;
}

/*
{
        "id": "file-XjGxS3KTG0uNmNOK362iJua3",
        "object": "file",
        "deleted": true
        }

 */

