package pe.edu.upc.managewise.meeting.meeting_service.meeting.interfaces.rest.resources;

public record RecordingResource(
        String recordingLink,
        String duration,
        boolean publicAccess
) {}
