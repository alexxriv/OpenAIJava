package com.vaysai.openaijava.model.request.moderations;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModerationsRequest {
    private String input;
    private String model;
}
