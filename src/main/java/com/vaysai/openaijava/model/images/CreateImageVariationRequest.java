package com.vaysai.openaijava.model.images;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateImageVariationRequest {

    /**
     *     The image to edit. Must be a valid PNG file,
     *     less than 4MB, and square. If mask is not provided,
     *     image must have transparency, which will be used as the mask.
     */
    @NonNull
    private MultipartFile image;


    /**
     * The number of images to generate. Must be between 1 and 10.
     */
    private Integer n;

    /**
     * The size of the generated images. Must be one of 256x256, 512x512, or 1024x1024.
     */
    private String size;

    /**
     * The format in which the generated images are returned. Must be one of url or b64_json
     */
    private String response_format;

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. Learn more.
     */
    private String user;
}
