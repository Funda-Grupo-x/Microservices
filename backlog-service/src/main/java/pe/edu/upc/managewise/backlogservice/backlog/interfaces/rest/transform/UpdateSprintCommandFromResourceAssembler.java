package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.transform;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands.UpdateSprintCommand;
import pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources.SprintResource;
import pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources.UpdateSprintResource;

public class UpdateSprintCommandFromResourceAssembler {
    public static UpdateSprintCommand toCommandFromResource(Long id, UpdateSprintResource resource){
        return new UpdateSprintCommand(id, resource.title(), resource.goal(), resource.status());
    }
}
