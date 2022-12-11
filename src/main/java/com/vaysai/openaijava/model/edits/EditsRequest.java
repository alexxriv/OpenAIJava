package com.vaysai.openaijava.model.edits;

import lombok.*;

import java.lang.annotation.Inherited;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditsRequest {
    /**
     * ID of the model to use. You can use the List models API to see all of your available models, or see our Model
     * overview for descriptions of them.
     */
    @NonNull
    private String model;
    /**
     * The input text to use as a starting point for the edit.
     */
    private String input;
    /**
     * The instruction that tells the model how to edit the prompt.
     */
    @NonNull
    private String instruction;
    /**
     * How many edits to generate for the input and instruction.
     */
    @ToString.Include(name="n")
    private int numberOfEdits;
    /**
     * What sampling temperature to use. Higher values means the model will take more risks. Try 0.9 for more creative
     * applications, and 0 (argmax sampling) for ones with a well-defined answer.
     */
    private double temperature;
    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of
     * the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass
     * are considered.
     */
    @ToString.Include(name="top_p")
    private double topP;
}