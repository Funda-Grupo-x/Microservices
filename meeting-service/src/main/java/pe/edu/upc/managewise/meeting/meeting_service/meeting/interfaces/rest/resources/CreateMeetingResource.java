package pe.edu.upc.managewise.meeting.meeting_service.meeting.interfaces.rest.resources;



public record CreateMeetingResource(String title, String dateStr, String timeStr, String link) {
}
