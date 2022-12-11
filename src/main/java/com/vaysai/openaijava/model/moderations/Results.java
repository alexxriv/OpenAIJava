package com.vaysai.openaijava.model.moderations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Results {
    private Categories categories;
    private CategoryScores categoryScores;
    private boolean flagged;

}
