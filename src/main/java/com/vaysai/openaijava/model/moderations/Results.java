package com.vaysai.openaijava.model.moderations;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Results {

    private Categories categories;

    @JsonProperty("category_scores")
    private CategoryScores categoryScores;

    private Boolean flagged;

}
