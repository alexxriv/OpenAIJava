package com.vaysai.openaijava.model.finetunes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RetrieveFineTuneRequest {
    private String fine_tune_id;
}
