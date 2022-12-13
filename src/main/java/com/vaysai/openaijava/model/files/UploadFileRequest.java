package com.vaysai.openaijava.model.files;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UploadFileRequest {
    /**
     * Name of the JSON Lines file to be uploaded.
     */
    @NonNull
    private MultipartFile file;
    /**
     * The intended purpose of the uploaded documents.
     */
    @NonNull
    private String purpose;
}