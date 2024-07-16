package com.nareun130.pragmatism.object.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

// * 이런 방법은 결국 모든 멤버변수를 public으로 선언한 거나 다름 없음, 오히려 접근이 더 불편
@Getter
@Setter
public class UserCreateRequest {

    // private String username;
    // private String password;
    // private String email;
    // private String address;
    // private String gender;
    // private int age;

    public final String username;
    public final String password;
    public final String email;
    public final String address;
    public final String gender;
    public final int age;

    //* DTO의 데이터를 JSON같은 형식으로 직렬화/역질렬화 할 수 있으며, 최초에 데이터가 할당된 이후 불변하게 해서 데이터 보호한다.
    @Builder
    public UserCreateRequest(
            @JsonProperty("username") String username,
            @JsonProperty("password") String password,
            @JsonProperty("email") String email,
            @JsonProperty("address") String address,
            @JsonProperty("gender") String gender,
            @JsonProperty("age") int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

}
