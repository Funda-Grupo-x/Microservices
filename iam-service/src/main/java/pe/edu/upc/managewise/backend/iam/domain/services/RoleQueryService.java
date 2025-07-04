package pe.edu.upc.managewise.backend.iam.domain.services;

import pe.edu.upc.managewise.backend.iam.domain.model.entities.Role;
import com.agrotech.iamservice.iam.domain.model.queries.GetAllRolesQuery;
import com.agrotech.iamservice.iam.domain.model.queries.GetRoleByNameQuery;

import java.util.List;
import java.util.Optional;

public interface RoleQueryService {
    List<Role> handle(GetAllRolesQuery query);
    Optional<Role> handle(GetRoleByNameQuery query);
}