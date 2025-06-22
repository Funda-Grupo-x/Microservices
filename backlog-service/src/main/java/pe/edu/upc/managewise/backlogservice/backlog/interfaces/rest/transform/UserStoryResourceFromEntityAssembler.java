package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.transform;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.aggregates.UserStory;
import pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources.TaskItemResource;
import pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources.UserStoryResource;

import java.util.List;
import java.util.stream.Collectors;

public class UserStoryResourceFromEntityAssembler {
    public static UserStoryResource toResourceFromEntity(UserStory entity){

        List<TaskItemResource> tasks = entity.getTaskList().getTasks().stream()
                .map(task -> new TaskItemResource(
                        task.getId(),
                        task.getTitle(),
                        task.getDescription(),
                        task.getStatus(),
                        task.getEstimation()))
                .collect(Collectors.toList());

        return new UserStoryResource(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getEpicId(),
                entity.getSprintId(),
                entity.getEffort(),
                entity.getStatus(),
                tasks);
    }
}
