package com.vaysai.openaijava.model.files;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UploadFileRequest {

    @NonNull
    private String file;

    @NonNull
    private String purpose;
}
