package com.vaysai.openaijava.model.images.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateImageResponse {
    private String created;
    private List<Url> data;
}
