package com.vaysai.openaijava.model.moderations;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModerationsRequest {

    @NonNull
    private String input;

    private String model;
}
