package pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands;

public record CreateTaskItemResource(String title, String description, Integer estimation) {
}
