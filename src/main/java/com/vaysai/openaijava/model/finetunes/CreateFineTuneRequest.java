package com.vaysai.openaijava.model.finetunes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateFineTuneRequest {
    private String training_file;
    private String validation_file;
    private String model;
    private Integer n_epochs;
    private Integer batch_size;
    private Double learning_rate_multiplier;
    private Double prompt_loss_weight;
    private Boolean compute_classification_metrics;
    private Integer classification_n_classes;
    private String classification_positive_class;
    //private Array classification_betas;
    private String suffix;
}
