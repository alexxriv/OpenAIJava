package com.vaysai.openaijava.model.response.completions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usage {
    private String prompt_tokens;
    private String completion_tokens;
    private String total_tokens;
}
