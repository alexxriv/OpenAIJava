package com.vaysai.openaijava.model.response.finetunes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateFineTuneResponse {
       private String id;
        private String object;
        private String model;
        private String created_at;
        private List<FineTuneEvent> events;
        private String fine_tuned_model;
        //private hyperparams PENDIENTE
        private String organization_id;
        private List<Object> result_files;//Pendiente el tipo
        private String status;
        private List<Object>validation_files;//Pendiente el tipo
        private List<Object> training_files;//Pendiente el tipo
        private String updated_at;
}
