// package circular;

// import java.util.ArrayList;
// import java.util.List;

// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.ObjectMapper;

// import lombok.Data;

// public class CircularEx1 {
//     public static void main(String[] args) {
//         // Team developerGroup = new Team(1, "devGroup", new ArrayList<>());
//         // developerGroup.getMembers().add(new Member(1, "foobar", developerGroup));
//         // developerGroup.getMembers().add(new Member(2, "helloworld", developerGroup));

//         ObjectMapper objectMapper = new ObjectMapper();
//         String result;
//         try {
//             // result = objectMapper.writeValueAsString(developerGroup);
//             System.out.println(result);

//         } catch (JsonProcessingException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//     }
// }
