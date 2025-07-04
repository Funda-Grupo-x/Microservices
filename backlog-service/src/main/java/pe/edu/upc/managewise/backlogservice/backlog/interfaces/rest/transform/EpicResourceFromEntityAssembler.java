package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.transform;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.aggregates.Epic;
import pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources.EpicResource;

public class EpicResourceFromEntityAssembler {
    public static EpicResource toResourceFromEntity(Epic entity){
        return new EpicResource(entity.getId(), entity.getTitle(), entity.getDescription());
    }
}
