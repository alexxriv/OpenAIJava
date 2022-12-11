package com.vaysai.openaijava.model.request.images;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateImageRequest {
    private String prompt;
    private Integer n;
    private String size;
    private String response_format;
    private String user;

}
