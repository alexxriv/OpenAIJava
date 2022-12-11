package com.vaysai.openaijava.model.embeddings;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Embedding {
    private String object;
    private List<Float> embedding;
    private int index;
}
