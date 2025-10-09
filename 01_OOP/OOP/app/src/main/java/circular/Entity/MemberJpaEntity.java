package circular.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "member")
public class MemberJpaEntity {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private long salary;
    // Member -> Team
    @ManyToOne
    @JoinColumn(name = "my_team_id")
    private TeamJpaEntity myTeam;
}
