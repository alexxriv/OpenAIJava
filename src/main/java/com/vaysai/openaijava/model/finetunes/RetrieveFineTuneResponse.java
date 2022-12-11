package com.vaysai.openaijava.model.finetunes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RetrieveFineTuneResponse {
    private String id;
    private String object;
    private String model;
    private String created_at;
    private List<FineTuneEvent> events;
    private String fine_tuned_model;
    //private hyperparams Pendiente el tipo
    private String organization_id;
    private List<Object> esult_files;//Pendiente el tipo
    private String status;
    private List<Object> alidation_files;//Pendiente el tipo
    private List<Object> training_files;//Pendiente el tipo
    private String updated_at;


}
