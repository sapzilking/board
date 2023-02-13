package com.sugil.board.service;

import com.sugil.board.domain.Member;
import com.sugil.board.dto.member.SignupRequestDTO;
import com.sugil.board.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public void signUp(SignupRequestDTO request) {
        Member member = Member.builder()
                .id(request.getId())
                .name(request.getName())
                .password(request.getPassword())
                .build();

        memberRepository.save(member);
    }
}
