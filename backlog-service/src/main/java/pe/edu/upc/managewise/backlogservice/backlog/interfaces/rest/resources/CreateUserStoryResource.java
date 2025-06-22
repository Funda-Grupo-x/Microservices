package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources;

public record CreateUserStoryResource(
        String title,
        String description,
        Long epicId,
        Long sprintId,
        Integer effort) {
}
