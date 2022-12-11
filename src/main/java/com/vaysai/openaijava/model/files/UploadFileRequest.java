package com.vaysai.openaijava.model.files;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UploadFileRequest {
    /**
     * Name of the JSON Lines file to be uploaded.
     */
    @NonNull
    private String file;
    /**
     * The intended purpose of the uploaded documents.
     */
    @NonNull
    private String purpose;
}
