package com.vaysai.openaijava.model.finetunes;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FineTuneEvent {

    private String object;

    @ToString.Include(name="created_at")
    private String createdAt;
    private String level;
    private String message;
}


/*
    {
      "object": "fine-tune-event",
      "created_at": 1614807352,
      "level": "info",
      "message": "Job enqueued. Waiting for jobs ahead to complete. Queue number: 0."
    }
 */