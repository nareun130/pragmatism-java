package circular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import circular.Entity.MemberJpaEntity;

@Repository
public interface MemberJpaRepository extends JpaRepository<MemberJpaEntity, Long> {

}
