package pe.edu.upc.managewise.meeting.meeting_service.meeting.domain.model.commands;

public record CreateMeetingCommand(String title, String dateStr, String timeStr, String link) {
}
