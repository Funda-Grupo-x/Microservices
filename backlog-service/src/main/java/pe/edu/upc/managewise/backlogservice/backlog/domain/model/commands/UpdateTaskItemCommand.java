package pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.valueobjects.Status;

public record UpdateTaskItemCommand(Long taskId, Long userStoryId, String title, String description, Status status, Integer estimation) {
}
