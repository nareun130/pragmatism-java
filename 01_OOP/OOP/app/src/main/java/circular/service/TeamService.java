package circular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import circular.Member;
import circular.Entity.MemberJpaEntity;
import circular.Entity.TeamJpaEntity;
import circular.repository.TeamJpaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class TeamService {

    @Autowired
    private MemberService memberService;

    @Autowired
    private TeamJpaRepository teamJpaRepository;

    public TeamJpaEntity getMyTeam(long memberId) {
        return memberService.getById(memberId).getMyTeam();
    }

    public TeamJpaEntity getById(long id) {
        return teamJpaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Team " + id));
    }

    public long getTemaSalary(long id) {
        return memberService.findByTeamId(id).stream().mapToLong(MemberJpaEntity::getSalary).sum();
    }
}
