package com.vaysai.openaijava.model.request.completion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompletionRequest {
    private String model;
    private String prompt;
    private String max_tokens;
    private String temperature;
    private String top_p;
    private String n;
    private String stream;
    private String logprobs;
    private String stop;

}


/*
{
  "model": "text-davinci-003",
  "prompt": "Say this is a test",
  "max_tokens": 7,
  "temperature": 0,
  "top_p": 1,
  "n": 1,
  "stream": false,
  "logprobs": null,
  "stop": "\n"
}
 */