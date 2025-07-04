package pe.edu.upc.managewise.memberservice.members.interfaces.rest.resources;

import pe.edu.upc.managewise.memberservice.members.domain.model.valueobjects.ScrumRoles;


public record CreateMemberResource(
        String fullName,
        ScrumRoles role,
        String email,
        String streetAddress
) {}
