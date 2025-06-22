package pe.edu.upc.managewise.issueservice.issues.application.internal.outboundservices.acl;

import org.springframework.stereotype.Service;
import pe.edu.upc.managewise.issueservice.members.interfaces.acl.MembersContextFacade;

import java.util.Optional;

@Service
public class ExternalMemberService {
    //Dependency Injection
    private final MembersContextFacade membersContextFacade;

    public ExternalMemberService(MembersContextFacade membersContextFacade) {
        this.membersContextFacade = membersContextFacade;
    }

    public Optional<Long> fetchMemberIdByFullName(String fullName) {
        Long memberId = membersContextFacade.fetchMemberIdByFullName(fullName);
        if (memberId.equals(0L)) {
            return Optional.empty();
        }
        return Optional.of(memberId);
    }
}
