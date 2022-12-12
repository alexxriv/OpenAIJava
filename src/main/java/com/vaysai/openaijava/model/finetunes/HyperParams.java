package com.vaysai.openaijava.model.finetunes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HyperParams {

    @JsonProperty("batch_size")
    private Integer batchSize;

    @JsonProperty("learning_rate_multiplier")
    private Double learningRateMultiplier;

    @JsonProperty("n_epochs")
    private Integer nEpochs;

    @JsonProperty("prompt_loss_weigh")
    private Double promptLossWeight;
}
