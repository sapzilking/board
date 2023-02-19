package com.sugil.board.service;

import com.sugil.board.domain.Member;
import com.sugil.board.dto.member.SignupRequestDTO;
import com.sugil.board.repository.MemberRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.*;

//@ExtendWith(MockitoExtension.class)
class MemberServiceTest {

    @Mock
    private MemberRepository memberRepository;

    @InjectMocks
    private MemberServiceImpl memberService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void signUpTest() {
        // given
        SignupRequestDTO requestDTO = SignupRequestDTO.builder()
                .id("test_id")
                .name("test_name")
                .password("test_password")
                .build();

        Member savedMember = Member.builder()
                .id("test_id")
                .name("test_name")
                .password("test_password")
                .sno(1L)
                .build();

        when(memberRepository.save(any(Member.class))).thenReturn(savedMember);

        // when
        Long savedMemberSno = memberService.signUp(requestDTO);

        // then
        Assertions.assertEquals(1L, savedMemberSno);
        verify(memberRepository, times(1)).save(any(Member.class));
    }


}