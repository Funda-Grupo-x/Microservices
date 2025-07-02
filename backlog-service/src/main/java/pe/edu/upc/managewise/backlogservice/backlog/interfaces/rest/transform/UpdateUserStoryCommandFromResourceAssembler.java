package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.transform;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands.UpdateUserStoryCommand;
import pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources.UpdateUserStoryResource;
import pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources.UserStoryResource;

public class UpdateUserStoryCommandFromResourceAssembler {
    //public static UpdateUserStoryCommand toCommandFromResource(Long id, UserStoryResource resource){
    public static UpdateUserStoryCommand toCommandFromResource(Long id, UpdateUserStoryResource resource){
        return new UpdateUserStoryCommand(id, resource.title(), resource.description(),
                resource.epicId(), resource.sprintId(), resource.status(),resource.effort());
    }
}
