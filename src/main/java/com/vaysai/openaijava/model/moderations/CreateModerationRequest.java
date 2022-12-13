package com.vaysai.openaijava.model.moderations;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationRequest {

    /**
     * The input text to classify
     */
    @NonNull
    private String input;


    /**
     * Two content moderations models are available: text-moderation-stable and text-moderation-latest.
     *
     * The default is text-moderation-latest which will be automatically upgraded over time.
     * This ensures you are always using our most accurate model.
     */
    private String model;

}
