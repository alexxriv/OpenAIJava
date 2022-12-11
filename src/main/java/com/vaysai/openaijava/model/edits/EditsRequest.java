package com.vaysai.openaijava.model.edits;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditsRequest {
    private String model;
    private String input;
    private String instruction;
    private Integer n;
    private Integer temperature;
    private Integer top_p;
}
