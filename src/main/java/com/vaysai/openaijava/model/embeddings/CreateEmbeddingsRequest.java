package com.vaysai.openaijava.model.embeddings;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateEmbeddingsRequest {
    /**
     * ID of the model to use. You can use the List models API to see all of your available models, or see our Model
     * overview for descriptions of them.
     */
    @NonNull
    private String model;
    /**
     * Input text to get embeddings for, encoded as a string or array of tokens. To get embeddings for multiple inputs
     * in a single request, pass an array of strings or array of token arrays. Each input must not exceed 2048 tokens
     * in length.
     */
    @NonNull
    private String input;
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse.
     */
    private String user;
}
