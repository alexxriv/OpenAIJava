package com.vaysai.openaijava.model.images;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateImageRequest {

    /**
     *     A text description of the desired image(s). The maximum length is 1000 characters.
     */
    @NonNull
    private String prompt;

    /**
     *     The number of images to generate. Must be between 1 and 10.
     */
    @ToString.Include(name="n")
    private int numberOfImages;

    /**
     *     The size of the generated images. Must be one of 256x256, 512x512, or 1024x1024.
     */
    private String size;

    /**
     *     The format in which the generated images are returned. Must be one of url or b64_json
     */
    @ToString.Include(name="response_format")
    private String responseFormat;

    /**
     *     A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse.
     */
    private String user;

}
