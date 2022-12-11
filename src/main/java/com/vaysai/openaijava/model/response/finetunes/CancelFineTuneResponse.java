package com.vaysai.openaijava.model.response.finetunes;

import com.vaysai.openaijava.model.response.files.File;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CancelFineTuneResponse {
    private String id;
    private String object;
    private String created_at;
    private List<FineTuneEvent> events;
    private String fine_tuned_model;
    private HyperParams hyperparams;
    private String organization_id;
    private String result_files;
    private String status;
    private String validation_files;
    private List<TrainingFile> training_files;
    private String updated_at;

}


/*
{
  "id": "ft-xhrpBbvVUzYGo8oUO1FY4nI7",
  "object": "fine-tune",
  "model": "curie",
  "created_at": 1614807770,
  "events": [ { ... } ],
  "fine_tuned_model": null,
  "hyperparams": { ... },
  "organization_id": "org-...",
  "result_files": [],
  "status": "cancelled",
  "validation_files": [],
  "training_files": [
    {
      "id": "file-XGinujblHPwGLSztz8cPS8XY",
      "object": "file",
      "bytes": 1547276,
      "created_at": 1610062281,
      "filename": "my-data-train.jsonl",
      "purpose": "fine-tune-train"
    }
  ],
  "updated_at": 1614807789,
}

 */