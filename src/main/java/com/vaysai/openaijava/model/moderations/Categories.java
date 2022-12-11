package com.vaysai.openaijava.model.moderations;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Categories {

    private boolean hate;

    @ToString.Include(name="hate/threatening")
    private boolean hateOrThreatening;

    @ToString.Include(name="self-harm")
    private boolean selfHarm;

    @ToString.Include(name="sexual")
    private boolean sexual;

    @ToString.Include(name="sexual/minors")
    private boolean sexualMinors;

    private boolean violence;

    @ToString.Include(name="violence/graphic")
    private boolean violenceOrGraphic;
}
