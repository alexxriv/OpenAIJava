package com.vaysai.openaijava.model.response.finetunes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RetrieveFineTunesRequest {
    private String fine_tune_id;
}