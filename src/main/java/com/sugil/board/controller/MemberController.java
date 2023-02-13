package com.sugil.board.controller;

import com.sugil.board.dto.member.SignupRequestDTO;
import com.sugil.board.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signup")
    void signUp(@RequestBody @Valid SignupRequestDTO request) {
        memberService.signUp(request);
    }
}
