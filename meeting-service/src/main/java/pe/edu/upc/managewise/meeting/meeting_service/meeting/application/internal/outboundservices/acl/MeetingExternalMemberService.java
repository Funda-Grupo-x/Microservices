package pe.edu.upc.managewise.meeting.meeting_service.meeting.application.internal.outboundservices.acl;

import org.springframework.stereotype.Service;
import pe.edu.upc.managewise.meeting.meeting_service.meeting.infrastructure.outboundservices.MemberServiceClient;

import java.util.List;
import java.util.Optional;

@Service
public class MeetingExternalMemberService {
  //Dependency Injection
  private final MemberServiceClient memberServiceClient;

  public MeetingExternalMemberService(MemberServiceClient memberServiceClient) {
    this.memberServiceClient = memberServiceClient;
  }

  // Obtener todos los miembros
  public List<Long> fetchAllMemberIds() {
    return memberServiceClient.fetchAllMemberIds();
  }

  // Método para obtener un ID de miembro por nombre completo
  public Optional<Long> fetchMemberIdByFullName(String fullName) {
    Long memberId = memberServiceClient.fetchMemberIdByFullName(fullName);
    if (memberId.equals(0L)) {
      return Optional.empty();
    }
    return Optional.of(memberId);
  }
}
