package com.vaysai.openaijava.model.files;

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
    private boolean deleted;
}