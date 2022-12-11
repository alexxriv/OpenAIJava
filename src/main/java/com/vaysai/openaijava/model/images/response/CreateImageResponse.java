package com.vaysai.openaijava.model.images.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateImageResponse {
    private String created;
    private List<ImageUrl> data;
}
