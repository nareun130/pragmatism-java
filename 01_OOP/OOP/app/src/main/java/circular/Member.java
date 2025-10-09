package circular;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * 아래와 같이 직렬화 시킬 수 있지만 옳바른 해결책 x
 */
//이미 직렬화를 마친 객체면 id를 기록
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Member.class)
@Data
@AllArgsConstructor
public class Member {

    private long id;
    private String name;
    private Team myTeam; //! 2. 상위 객체에서 하위 객체에 대한 참조를 제거
    // private long myTeamId; //! 1. 직접 참조 -> 간접 참조
    private int salary;

    // public int calculateTeamMemberTotalSalary() {
    //     int result = 0;

    //     for (Member member : myTeam.getMembers()) {
    //         result += member.salary;
    //     }
    //     return result;
    // }
}
