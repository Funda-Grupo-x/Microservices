package pe.edu.upc.managewise.backlogservice.backlog.interfaces.rest.resources;

import java.util.Date;

public record CreateSprintResource(String title, String goal, Date endDate) {
}
