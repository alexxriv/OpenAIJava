package com.vaysai.openaijava.model.completions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Choice {

    private String text;
    private int index;
    private int logprobs;

    @ToString.Include(name="finish_reason")
    private String finishReason;

}

/*
        {
            "text": "\n\nThis is indeed a test",
            "index": 0,
            "logprobs": null,
            "finish_reason": "length"
        }
 */