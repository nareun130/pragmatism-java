package circular.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@jakarta.persistence.Entity(name = "team")
public class TeamJpaEntity {

  @Id
  private Long id;

  @Column
  private String name;

  // Team -> member
  @OneToMany(mappedBy = "myTeam")
  private List<MemberJpaEntity> members;
}
