package pe.edu.upc.managewise.issueservice.issues.interfaces.rest.resources;

public record EventRecordItemResource(
        Long id, // Add this field
        String createdDate,
        String madeBy,
        String eventName,
        String description
) {}
