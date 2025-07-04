package pe.edu.upc.managewise.backlogservice.backlog.domain.services;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.aggregates.Epic;
import pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands.CreateEpicCommand;
import pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands.DeleteEpicCommand;
import pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands.UpdateEpicCommand;

import java.util.Optional;

public interface EpicCommandService {
    Long handle(CreateEpicCommand command);
    Optional<Epic> handle(UpdateEpicCommand command);
    void handle(DeleteEpicCommand command);
}
