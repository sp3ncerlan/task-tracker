package com.spencer.tasks.mappers;

import com.spencer.tasks.domain.dto.TaskListDto;
import com.spencer.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
