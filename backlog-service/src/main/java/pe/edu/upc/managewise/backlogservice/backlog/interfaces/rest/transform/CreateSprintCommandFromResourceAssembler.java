package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.transform;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands.CreateSprintCommand;
import pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources.CreateSprintResource;

public class CreateSprintCommandFromResourceAssembler {
    public static CreateSprintCommand toCommandFromResource(CreateSprintResource resource){
        return new CreateSprintCommand(resource.title(), resource.goal(), resource.endDate());
    }
}
