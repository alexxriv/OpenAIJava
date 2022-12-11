package com.vaysai.openaijava.model.embeddings;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateEmbeddingsResponse {

    private String object;

    private List<Embedding> data;

    private Usage usage;
}
