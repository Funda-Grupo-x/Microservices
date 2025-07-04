package pe.edu.upc.managewise.memberservice.members.domain.model.queries;


import pe.edu.upc.managewise.memberservice.members.domain.model.valueobjects.ScrumRoles;

public record GetMembersByRoleQuery(ScrumRoles role) {}