package pe.edu.upc.managewise.memberservice.members.domain.model.commands;

import pe.edu.upc.managewise.memberservice.members.domain.model.valueobjects.ScrumRoles;

public record UpdateMemberCommand(
        Long memberId,
        String fullName,
        String email,
        String streetAddress,
        ScrumRoles role
) {}
