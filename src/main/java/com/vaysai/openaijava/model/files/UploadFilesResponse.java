package com.vaysai.openaijava.model.files;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UploadFilesResponse {
    private String id;
    private String object;
    private String bytes;
    @JsonProperty("created_at")
    private String createdAt;
    private String filename;
    private String purpose;
}