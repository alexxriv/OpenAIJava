package com.vaysai.openaijava.model.embeddings;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmbeddingsRequest {
    private String model;
    private String input;
    private String user;
}
