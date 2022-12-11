package com.vaysai.openaijava.model.finetunes;

import com.vaysai.openaijava.model.files.File;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FineTune {

    private String id;
    private String object;
    private String model;

    @ToString.Include(name="created_at")
    private String createdAt;

    private List<FineTuneEvent> events;

    @ToString.Include(name="fine_tuned_model")
    private String fineTunedModel;

    private HyperParams hyperparams;

    @ToString.Include(name="organization_id")
    private String organizationId;

    @ToString.Include(name="result_files")
    private List<File> resultFiles;

    private String status;

    @ToString.Include(name="validation_files")
    private List<File> validationFiles;

    @ToString.Include(name="training_files")
    private List<File> trainingFiles;

    @ToString.Include(name="updated_at")
    private String updatedAt;
}
