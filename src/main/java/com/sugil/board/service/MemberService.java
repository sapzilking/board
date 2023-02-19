package com.sugil.board.service;

import com.sugil.board.dto.member.SignupRequestDTO;

public interface MemberService {
    Long signUp(SignupRequestDTO request);
}
