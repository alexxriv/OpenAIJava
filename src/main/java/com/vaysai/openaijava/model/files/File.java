package com.vaysai.openaijava.model.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class File {
    private String id;
    private String object;
    private String bytes;
    @JsonProperty("created_at")
    private String createdAt;
    private String filename;
    private String purpose;
}