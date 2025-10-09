package circular;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Team {
    private long id;

    private String name;

    //! 2. 상위 객체에서 하위 객체에 대한 참조를 제거
    // private List<Member> members;
}
