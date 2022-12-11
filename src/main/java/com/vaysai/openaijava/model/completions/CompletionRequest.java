package com.vaysai.openaijava.model.completions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.util.Map;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompletionRequest {
    /**
     * ID of the model to use. You can use the List models API to see all of your available models,
     * or see our Model overview for descriptions of them.
     */
    @NonNull
    private String model;
    /**
     * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens,
     * or array of token arrays.
     */
    private String prompt;
    /**
     * The maximum number of tokens to generate in the completion.
     */
    @JsonProperty("max_tokens")
    private Integer maxTokens;
    /**
     * What sampling temperature to use. Higher values means the model will take more risks.
     * Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.
     */
    private Double temperature;
    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results
     * of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability
     * mass are considered.
     */
    @JsonProperty("top_p")
    private Double topP;
    /**
     * How many completions to generate for each prompt.
     */
    @JsonProperty("n")
    private Integer numberOfCompletions;
    /**
     * Whether to stream back partial progress. If set, tokens will be sent as data-only server-sent events as they
     * become available, with the stream terminated by a data: [DONE] message
     */
    private Boolean stream;
    /**
     * Include the log probabilities on the logprobs most likely tokens, as well the chosen tokens. For example,
     * if logprobs is 5, the API will return a list of the 5 most likely tokens. The API will always return the
     * logprob of the sampled token, so there may be up to logprobs+1 elements in the response.
     */
    @JsonProperty("logprobs")
    private Integer logProbabilities;
    /**
     * Echo back the prompt in addition to the completion
     */
    private Boolean echo;
    /**
     * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the
     * stop sequence.
     */
    private String stop;
    /**
     * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the
     * stop sequence.
     */
    @JsonProperty("presence_penalty")
    private Double presencePenalty;
    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text
     * so far, decreasing the model's likelihood to repeat the same line verbatim.
     */
    @JsonProperty("frequency_penalty")
    private Double frequencyPenalty;
    /**
     * Generates best_of completions server-side and returns the "best" (the one with the highest log probability per
     * token). Results cannot be streamed.
     */
    @JsonProperty("best_of")
    private Integer bestOf;
    /**
     * Modify the likelihood of specified tokens appearing in the completion.
     */
    @JsonProperty("logit_bias")
    private Map<String,Integer> logitBias;
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse.
     */
    private String user;
}