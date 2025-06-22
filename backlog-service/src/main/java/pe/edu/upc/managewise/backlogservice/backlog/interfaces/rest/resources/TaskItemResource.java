package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.valueobjects.Status;

public record TaskItemResource(
        Long taskId,
        String title,
        String description,
        Status status,
        Integer estimation) {
}
