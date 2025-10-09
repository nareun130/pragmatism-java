package objects.dto.next;

import lombok.Builder;

public class UserCreateRequest {
    public final String username;
    public final String password;
    public final String email;
    public final String address;
    public final String gender;
    public final int age;

    @Builder
    public UserCreateRequest(String username, String password, String email, String address, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

}
