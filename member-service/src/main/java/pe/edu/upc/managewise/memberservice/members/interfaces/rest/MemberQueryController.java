package pe.edu.upc.managewise.memberservice.members.interfaces.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.managewise.memberservice.members.domain.model.aggregates.Member;
import pe.edu.upc.managewise.memberservice.members.domain.model.queries.GetAllMembersQuery;
import pe.edu.upc.managewise.memberservice.members.domain.model.queries.GetMemberByFullNameQuery;
import pe.edu.upc.managewise.memberservice.members.domain.services.MemberQueryService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/members")
public class MemberQueryController {
    private final MemberQueryService memberQueryService;

    public MemberQueryController(MemberQueryService memberQueryService) {
        this.memberQueryService = memberQueryService;
    }

    @GetMapping("/ids")
    public ResponseEntity<List<Long>> getAllMemberIds() {
        List<Member> members = memberQueryService.handle(new GetAllMembersQuery());
        List<Long> ids = members.stream().map(Member::getId).collect(Collectors.toList());
        return ResponseEntity.ok(ids);
    }

    @GetMapping("/id-by-fullname")
    public ResponseEntity<Long> getMemberIdByFullName(@RequestParam String fullName) {
        Optional<Member> member = memberQueryService.handle(new GetMemberByFullNameQuery(fullName));
        return ResponseEntity.ok(member.map(Member::getId).orElse(0L));
    }
}

