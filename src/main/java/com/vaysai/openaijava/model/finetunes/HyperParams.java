package com.vaysai.openaijava.model.finetunes;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HyperParams {

    @ToString.Include(name="batch_size")
    private int batchSize;

    @ToString.Include(name="learning_rate_multiplier")
    private double learningRateMultiplier;

    @ToString.Include(name="n_epochs")
    private int nEpochs;

    @ToString.Include(name="prompt_loss_weigh")
    private double promptLossWeight;
}
