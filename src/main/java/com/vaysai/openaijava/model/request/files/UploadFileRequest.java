package com.vaysai.openaijava.model.request.files;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UploadFileRequest {
    private String file;
    private String purpose;
}
