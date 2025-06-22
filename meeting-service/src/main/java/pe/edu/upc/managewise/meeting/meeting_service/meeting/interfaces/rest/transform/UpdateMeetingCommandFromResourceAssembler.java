package pe.edu.upc.managewise.meeting.meeting_service.meeting.interfaces.rest.transform;


import pe.edu.upc.managewise.meeting.meeting_service.meeting.domain.model.commands.UpdateMeetingCommand;
import pe.edu.upc.managewise.meeting.meeting_service.meeting.interfaces.rest.resources.MeetingResource;

public class UpdateMeetingCommandFromResourceAssembler {
    public static UpdateMeetingCommand toCommandFromResource(Long meetingId, MeetingResource resource) {
        return new UpdateMeetingCommand(meetingId, resource.title(), resource.dateStr(), resource.timeStr(), resource.link());
    }
}
