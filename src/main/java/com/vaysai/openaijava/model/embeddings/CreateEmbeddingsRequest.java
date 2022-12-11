package com.vaysai.openaijava.model.embeddings;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmbeddingsRequest {

    @NonNull
    private String model;

    @NonNull
    private String input;

    private String user;
}
