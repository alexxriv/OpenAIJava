package com.vaysai.openaijava.model.images;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateImageEditRequest {

    /**
     *     A text description of the desired image(s). The maximum length is 1000 characters.
     */
    @NonNull
    private MultipartFile image;

    /**
     *     An additional image whose fully transparent areas
     *     (e.g. where alpha is zero) indicate where image should be edited.
     *     Must be a valid PNG file, less than 4MB, and have the same dimensions as image.
     */
    private MultipartFile mask;

    /**
     *     A text description of the desired image(s). The maximum length is 1000 characters.
     */
    @NonNull
    private String prompt;

    /**
     * The number of images to generate. Must be between 1 and 10.
     */
    private Integer n;

    /**
     * The format in which the generated images are returned. Must be one of url or b64_json
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
