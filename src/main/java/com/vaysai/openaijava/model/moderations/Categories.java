package com.vaysai.openaijava.model.moderations;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Categories {

    private Boolean hate;

    @JsonProperty("hate/threatening")
    private Boolean hateOrThreatening;

    @JsonProperty("self-harm")
    private Boolean selfHarm;

    @JsonProperty("sexual")
    private Boolean sexual;

    @JsonProperty("sexual/minors")
    private Boolean sexualMinors;

    private Boolean violence;

    @JsonProperty("violence/graphic")
    private Boolean violenceOrGraphic;
}
