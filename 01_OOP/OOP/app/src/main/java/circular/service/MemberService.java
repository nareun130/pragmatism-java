package circular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import circular.Entity.MemberJpaEntity;
import circular.repository.MemberJpaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class MemberService {

    @Autowired
    private TeamService teamService;
    @Autowired
    private MemberJpaRepository memberJpaRepository;

    public MemberJpaEntity getById(long id) {
        return memberJpaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Member: " + id));
    }

    public List<MemberJpaEntity> findByTeamId(long teamId){
        return teamService.getById(teamId).getMembers();
    }
}
