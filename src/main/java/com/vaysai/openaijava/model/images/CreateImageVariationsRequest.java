package com.vaysai.openaijava.model.images;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateImageVariationsRequest {
    @NonNull
    private String image;

    @ToString.Include(name="n")
    private int numberOfImages;

    private String size;

    @ToString.Include(name="response_format")
    private String responseFormat;

    private String user;
}
