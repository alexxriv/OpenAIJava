package com.vaysai.openaijava.model.completions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usage {

    @ToString.Include(name="prompt_tokens")
    private int promptTokens;

    @ToString.Include(name="completion_tokens")
    private int completionTokens;

    @ToString.Include(name="total_tokens")
    private int totalTokens;
}

/*
 {
        "prompt_tokens": 5,
        "completion_tokens": 7,
        "total_tokens": 12
    }
 */
