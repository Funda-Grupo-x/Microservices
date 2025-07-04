package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources;

import pe.edu.upc.managewise.backlogservice.backlog.domain.model.valueobjects.SprintStatus;

import java.util.Date;

public record SprintResource(Long id, String title, String goal, Date endDate, Date startDate, SprintStatus status) {
}
