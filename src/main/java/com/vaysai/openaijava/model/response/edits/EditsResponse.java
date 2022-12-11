package com.vaysai.openaijava.model.response.edits;

import com.vaysai.openaijava.model.response.Choice;
import com.vaysai.openaijava.model.response.Usage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EditsResponse {

    private String object;
    private String created;
    private List<Choice> choices;
    private Usage usage;
}
