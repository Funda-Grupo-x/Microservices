package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.valueobjects.Status;

public record UpdateUserStoryResource(
        String title,
        String description,
        Long epicId,
        Long sprintId,
        Status status,
        Integer effort
) {
}
