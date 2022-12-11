package com.vaysai.openaijava.model.moderations;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryScores {
    private Float hate;

    @JsonProperty("hate/threatening")
    private Float hateOrThreatening;

    @JsonProperty("self-harm")
    private Float selfHarm;

    @JsonProperty("sexual")
    private Float sexual;

    @JsonProperty("sexual/minors")
    private Float sexualMinors;

    private Float violence;

    @JsonProperty("violence/graphic")
    private Float violenceOrGraphic;
}
