package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.valueobjects.SprintStatus;

public record UpdateSprintResource (
        String title,
        String goal,
        SprintStatus status
) {
}
