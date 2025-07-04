package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.transform;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands.CreateUserStoryCommand;
import pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources.CreateUserStoryResource;

import java.util.Collections;

public class CreateUserStoryCommandFromResourceAssembler {
    public static CreateUserStoryCommand toCommandFromResource(CreateUserStoryResource resource){
        return new CreateUserStoryCommand(
                resource.title(),
                resource.description(),
                resource.epicId(),
                resource.sprintId(),
                resource.effort(),
                Collections.emptyList());
    }
}
