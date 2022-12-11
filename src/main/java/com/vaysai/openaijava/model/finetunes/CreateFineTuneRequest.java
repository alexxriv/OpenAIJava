package com.vaysai.openaijava.model.finetunes;
import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateFineTuneRequest {

    /**
     * The ID of an uploaded file that contains training data.
     *
     * See upload file for how to upload a file.
     *
     * Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys "prompt" and "completion".
     * Additionally, you must upload your file with the purpose fine-tune
     */
    @NonNull
    @ToString.Include(name="training_file")
    private String trainingFile;

    /**
     * The ID of an uploaded file that contains validation data.
     *
     * If you provide this file, the data is used to generate validation metrics periodically during fine-tuning.
     * These metrics can be viewed in the fine-tuning results file. Your train and validation data should be mutually exclusive.
     */
    @ToString.Include(name="validation_file")
    private String validationFile;

    /**
     * The name of the base model to fine-tune.
     * You can select one of "ada", "babbage", "curie", "davinci",
     * or a fine-tuned model created after 2022-04-21. To learn more about these models, see the Models documentation.
     */
    private String model;

    /**
     * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.
     */
    @ToString.Include(name="n_epochs")
    private Integer nEpochs;

    /**
     * The batch size to use for training.
     * The batch size is the number of training examples used to train a single forward and backward pass.
     *
     * By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set,
     * capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets.
     */
    @ToString.Include(name="batch_size")
    private Integer batchSize;

    /**
     * The learning rate multiplier to use for training.
     * The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.
     */
    @ToString.Include(name="learning_rate_multiplier")
    private Double learningRateMultiplier;

    /**
     * The weight to use for loss on the prompt tokens.
     * This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0),
     * and can add a stabilizing effect to training when completions are short.
     *
     */
    @ToString.Include(name="prompt_loss_weight")
    private Double promptLossWeight;

    /**
     * If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch.
     * These metrics can be viewed in the results file.
     */
    @ToString.Include(name="compute_classification_metrics")
    private Boolean computeClassificationMetrics;

    /**
     *
     * The number of classes in a classification task.
     *
     * This parameter is required for multiclass classification.
     */
    @ToString.Include(name="classification_n_classes")
    private Integer classificationNClasses;

    /**
     * The positive class in binary classification.
     *
     * This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.
     *
     */
    @ToString.Include(name="classification_positive_class")
    private String classificationPositiveClass;


    /**
     *
     * If this is provided, we calculate F-beta scores at the specified beta values.
     * The F-beta score is a generalization of F-1 score. This is only used for binary classification.
     */
    @ToString.Include(name="classification_betas")
    private List<String> classificationBetas;

    /**
     * A string of up to 40 characters that will be added to your fine-tuned model name.
     */
    private String suffix;
}
