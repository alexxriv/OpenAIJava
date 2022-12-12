package com.vaysai.openaijava.model.finetunes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vaysai.openaijava.model.files.File;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTune {

    private String id;
    private String object;
    private String model;

    @JsonProperty("created_at")
    private String createdAt;

    private List<FineTuneEvent> events;

    @JsonProperty("fine_tuned_model")
    private String fineTunedModel;

    private HyperParams hyperparams;

    @JsonProperty("organization_id")
    private String organizationId;

    @JsonProperty("result_files")
    private List<File> resultFiles;

    private String status;

    @JsonProperty("validation_files")
    private List<File> validationFiles;

    @JsonProperty("training_files")
    private List<File> trainingFiles;

    @JsonProperty("updated_at")
    private String updatedAt;
}
