package pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands;

public record UpdateEpicCommand(Long id, String title, String description) {
}
