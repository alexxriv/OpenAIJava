package com.vaysai.openaijava.model.moderations;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryScores {
    private float hate;

    @ToString.Include(name="hate/threatening")
    private float hateOrThreatening;

    @ToString.Include(name="self-harm")
    private float selfHarm;

    @ToString.Include(name="sexual")
    private float sexual;

    @ToString.Include(name="sexual/minors")
    private float sexualMinors;

    private float violence;

    @ToString.Include(name="violence/graphic")
    private float violenceOrGraphic;
}
