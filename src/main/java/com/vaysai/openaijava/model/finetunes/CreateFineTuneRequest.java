package com.vaysai.openaijava.model.finetunes;
import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateFineTuneRequest {

    @NonNull
    @ToString.Include(name="training_file")
    private String trainingFile;

    @ToString.Include(name="validation_file")
    private String validationFile;

    private String model;

    @ToString.Include(name="n_epochs")
    private Integer nEpochs;

    @ToString.Include(name="batch_size")
    private Integer batchSize;

    @ToString.Include(name="learning_rate_multiplier")
    private Double learningRateMultiplier;

    @ToString.Include(name="prompt_loss_weight")
    private Double promptLossWeight;

    @ToString.Include(name="compute_classification_metrics")
    private Boolean computeClassificationMetrics;

    @ToString.Include(name="classification_n_classes")
    private Integer classificationNClasses;

    @ToString.Include(name="classification_positive_class")
    private String classificationPositiveClass;

    @ToString.Include(name="classification_betas")
    private List<String> classificationBetas;

    private String suffix;
}
