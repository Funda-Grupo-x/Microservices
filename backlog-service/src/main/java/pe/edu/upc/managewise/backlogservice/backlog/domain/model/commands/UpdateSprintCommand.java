package pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.valueobjects.SprintStatus;

public record UpdateSprintCommand(Long id, String title, String goal, SprintStatus status) {
}
