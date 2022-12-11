package com.vaysai.openaijava.model.response.moderations;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModerationsResponse {
    private String input;
    private String model;
    // private List<> Pendiente
}
