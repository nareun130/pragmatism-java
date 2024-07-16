package com.nareun130.pragmatism.object.dto;

import lombok.Getter;
import lombok.Setter;
// * 이런 방법은 결국 모든 멤버변수를 public으로 선언한 거나 다름 없음, 오히려 접근이 더 불편
@Getter
@Setter
public class UserCreateRequest {

    private String username;
    private String password;
    private String email;
    private String address;
    private String gender;
    private int age;
}
