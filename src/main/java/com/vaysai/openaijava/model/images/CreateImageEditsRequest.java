package com.vaysai.openaijava.model.images;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateImageEditsRequest {

    @NonNull
    private String image;
    private String mask;

    @NonNull
    private String prompt;

    @ToString.Include(name="number_of_images")
    private int numberOfImages;
    private String size;

    @ToString.Include(name="response_format")
    private String responseFormat;
    private String user;
}
