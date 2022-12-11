package com.vaysai.openaijava.model.completions;

import lombok.*;

import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompletionRequest {

    @NonNull
    private String model;

    private String prompt;

    @ToString.Include(name = "max_tokens")
    private int maxTokens;

    private double temperature;

    @ToString.Include(name="top_p")
    private double topP;

    @ToString.Include(name="n")
    private int numberOfCompletions;

    private boolean stream;

    @ToString.Include(name="logprobs")
    private int logProbabilities;

    private boolean echo;

    private String stop;

    @ToString.Include(name="presence_penalty")
    private double presencePenalty;

    @ToString.Include(name="frequency_penalty")
    private double frequencyPenalty;

    @ToString.Include(name="best_of")
    private int bestOf;

    @ToString.Include(name="logit_bias")
    private Map<String,Integer> logitBias;

    private String user;



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
  "logit_bias":{"50256": -100,"556": 100}
}
 */