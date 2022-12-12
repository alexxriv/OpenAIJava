package com.vaysai.openaijava.model.moderations;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateModerationRequest {

    /**
     * ID of the model to use. You can use the List models API to see all of your available models,
     * or see our Model overview for descriptions of them.
     */
    @NonNull
    private String mode;

    /**
     * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.
     * Note that <|endoftext|> is the document separator that the model sees during training,
     * so if a prompt is not specified the model will generate as if from the beginning of a new document.
     */
    private String prompt;

    /**
     * The suffix that comes after a completion of inserted text.
     */
    private String suffix;

    /**
     * The maximum number of tokens to generate in the completion.
     *
     * The token count of your prompt plus max_tokens cannot exceed the model's context length.
     * Most models have a context length of 2048 tokens (except for the newest models, which support 4096).
     */
    @JsonProperty("max_tokens")
    private Integer maxTokens;

    /**
     * What sampling temperature to use. Higher values means the model will take more risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.
     *
     * We generally recommend altering this or top_p but not both.
     */
    private Double temperature;

    /**
     * An alternative to sampling with temperature, called nucleus sampling,
     * where the model considers the results of the tokens with top_p probability mass.
     * So 0.1 means only the tokens comprising the top 10% probability mass are considered.
     */
    @JsonProperty("top_n")
    private Double topN;

    /**
     * How many completions to generate for each prompt.
     *
     * Note: Because this parameter generates many completions,
     * it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for max_tokens and stop.
     */
    private Integer n;

    /**
     * Whether to stream back partial progress. If set, tokens will be sent as data-only server-sent events as they become available,
     * with the stream terminated by a data: [DONE] message.
     */
    private String stream;

    /**
     * Include the log probabilities on the logprobs most likely tokens, as well the chosen tokens. For example, if logprobs is 5,
     * the API will return a list of the 5 most likely tokens. The API will always return the logprob of the sampled token,
     * so there may be up to logprobs+1 elements in the response.
     */
    @JsonProperty("logprobs")
    private Integer logProbabilities;


    /**
     * Echo back the prompt in addition to the completion
     */
    private String echo;

    /**
     * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence.
     */
    private String stop;

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.
     */
    @JsonProperty("presence_penalty")
    private Double presencePenalty;

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.
     */
    @JsonProperty("best_of")
    private Double bestOf;

    /**
     * Generates best_of completions server-side and returns the "best" (the one with the highest log probability per token). Results cannot be streamed.
     */
    @JsonProperty("logit_bias")
    private String logitBias;

    /**
     * Modify the likelihood of specified tokens appearing in the completion.
     */
    private String user;

}
