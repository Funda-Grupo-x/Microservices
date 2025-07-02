package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.transform;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands.UpdateEpicCommand;
import pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources.EpicResource;

public class UpdateEpicCommandFromResourceAssembler {
    public static UpdateEpicCommand toCommandFromResource(Long id, EpicResource resource){
        return new UpdateEpicCommand(id, resource.title(), resource.description());
    }
}


