package pe.edu.upc.managewise.backlogservice.backlog.domain.model.commands;

public record CreateTaskITemByUserStoryIdCommand(Long userStoryId, String title, String description, Integer estimation) {}