package pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.valueobjects.Status;

public record UpdateUserStoryCommand(Long id, String title, String description, Long epicId, Long SprintId, Status status, Integer effort) {
}
