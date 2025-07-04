package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.transform;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands.UpdateTaskItemCommand;
import pe.edu.upc.managewise.backlogservice.backlog.domain.model.valueobjects.Status;

public class UpdateTaskItemCommandFromResourceAssembler {
    public static UpdateTaskItemCommand toCommandFromResource(Long taskId, Long userStoryId, String title, String description, Status status, Integer estimation){
        return new UpdateTaskItemCommand(taskId, userStoryId, title, description, status, estimation);
    }
}
