package pe.edu.upc.managewise.issueservice.issues.interfaces.rest.transform;

import pe.edu.upc.managewise.issueservice.issues.domain.model.entities.EventRecordItem;
import pe.edu.upc.managewise.issueservice.issues.interfaces.rest.resources.EventRecordItemResource;

public class EventRecordItemResourceFromEntityAssembler {
    public static EventRecordItemResource toResourceFromEntity(EventRecordItem eventRecordItem) {
        return new EventRecordItemResource(
                eventRecordItem.getId(), // Ensure the ID is included
                eventRecordItem.getCreatedDate(),
                eventRecordItem.getMadeBy(),
                eventRecordItem.getEventName(),
                eventRecordItem.getDescription()
        );
    }
}