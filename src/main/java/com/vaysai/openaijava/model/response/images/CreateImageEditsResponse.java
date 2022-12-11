package com.vaysai.openaijava.model.response.images;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateImageEditsResponse {
    private String created;
    private List<Url> data;
}
