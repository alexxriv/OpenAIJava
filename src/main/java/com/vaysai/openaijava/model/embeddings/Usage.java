package com.vaysai.openaijava.model.embeddings;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usage {
    @ToString.Include(name="prompt_tokens")
    private String promptTokens;

    @ToString.Include(name="total_tokens")
    private String totalTokens;
}
