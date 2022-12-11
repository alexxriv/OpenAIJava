package com.vaysai.openaijava.model.edits;

import lombok.*;

import java.lang.annotation.Inherited;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditsRequest {

    @NonNull
    private String model;
    private String input;

    @NonNull
    private String instruction;

    @ToString.Include(name="n")
    private int numberOfEdits;

    private double temperature;

    @ToString.Include(name="top_p")
    private double topP;
}
