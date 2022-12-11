package com.vaysai.openaijava.model.completions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Choice {

    private String text;
    private Integer index;
    private Integer logprobs;

    @JsonProperty("finish_reason")
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