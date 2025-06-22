package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.valueobjects.Status;

import java.util.List;

public record UserStoryResource(
        Long id,
        String title,
        String description,
        Long epicId,
        Long sprintId,
        Integer effort,
        Status status,
        List<TaskItemResource> tasks) {
}
