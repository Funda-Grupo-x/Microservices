package pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands;

public record DeleteTaskCommand(Long userStoryId, Long taskId) {
}
