package circular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import circular.Entity.TeamJpaEntity;

@Repository
public interface TeamJpaRepository extends JpaRepository<TeamJpaEntity, Long>{

    
} 