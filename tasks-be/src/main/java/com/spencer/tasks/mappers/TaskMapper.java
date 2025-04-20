package com.spencer.tasks.mappers;

import com.spencer.tasks.domain.dto.TaskDto;
import com.spencer.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
