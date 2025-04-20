package com.spencer.tasks.domain.dto;

import java.time.LocalDateTime;
import java.util.UUID;
import com.spencer.tasks.domain.entities.TaskPriority;
import com.spencer.tasks.domain.entities.TaskStatus;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
