package com.vaysai.openaijava.model.finetunes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListFineTuneResponse {
    private String object;
    private List<FineTune> data;//Pendiente el tipo
}
