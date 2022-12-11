package com.vaysai.openaijava.model.moderations;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationsResponse {
    private String d;
    private String model;
    private Results results;
    // private List<> Pendiente
}
