package com.sugil.board.dto.member;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@Getter
public class SignupRequestDTO {

    @Pattern(regexp = "^[a-z|0-9]{5,10}$")
    private String id;
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,12}$")
    private String password;
    @Pattern(regexp = "^[가-힣]{2,4}$")
    private String name;
}
