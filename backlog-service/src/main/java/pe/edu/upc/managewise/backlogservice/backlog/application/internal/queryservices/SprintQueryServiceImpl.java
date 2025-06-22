package pe.edu.upc.managewise.backlogservice.backlog.application.internal.queryservices;

import org.springframework.stereotype.Service;
import pe.edu.upc.managewise.backlogservice.backlog.domain.model.aggregates.Sprint;
import pe.edu.upc.managewise.backlogservice.backlog.domain.model.queries.GetAllSprintsQuery;
import pe.edu.upc.managewise.backlogservice.backlog.domain.model.queries.GetSprintByIdQuery;
import pe.edu.upc.managewise.backlogservice.backlog.domain.model.queries.GetSprintByTittleQuery;
import pe.edu.upc.managewise.backlogservice.backlog.domain.services.SprintQueryService;
import pe.edu.upc.managewise.backlogservice.backlog.infrastructure.persistence.jpa.repositories.SprintRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SprintQueryServiceImpl implements SprintQueryService {
    private final SprintRepository sprintRepository;

    public SprintQueryServiceImpl(SprintRepository sprintRepository) {
        this.sprintRepository = sprintRepository;
    }

    @Override
    public List<Sprint> handle(GetAllSprintsQuery query){
        return this.sprintRepository.findAll();
    }

    @Override
    public Optional<Sprint> handle(GetSprintByIdQuery query){
        return this.sprintRepository.findById(query.sprintId());
    }

    @Override
    public Optional<Sprint> handle(GetSprintByTittleQuery query) {
        return this.sprintRepository.findByTitle(query.tittle());
    }
}
