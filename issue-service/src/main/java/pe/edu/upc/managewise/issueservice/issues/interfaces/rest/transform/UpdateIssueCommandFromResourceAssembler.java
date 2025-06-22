package pe.edu.upc.managewise.issueservice.issues.interfaces.rest.transform;

import pe.edu.upc.managewise.issueservice.issues.domain.model.commands.UpdateIssueCommand;
import pe.edu.upc.managewise.issueservice.issues.interfaces.rest.resources.IssueResource;

//Input
public record UpdateIssueCommandFromResourceAssembler() {
    public static UpdateIssueCommand toCommandFromResource(Long reportId, IssueResource resource){
        return new UpdateIssueCommand(reportId,resource.title(),resource.sprintAssociate() , resource.description(), resource.status(), resource.priority(), resource.assignedTo(), resource.madeBy(), resource.createdIn(), resource.resolutionDate());
    }
}
