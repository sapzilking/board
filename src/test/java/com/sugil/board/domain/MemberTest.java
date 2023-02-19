package com.sugil.board.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

class MemberTest {

    @DisplayName("멤버 생성 확인")
    @Test
    void createMemberTest() {
        // given
        String id = "testUser";
        String password = "testPassword";
        String name = "Test User";

        // when
        Member member = Member.builder().id("test01")
                .password("1234")
                .name("김철수")
                .build();

        // then
        assertThat(member.getId()).isEqualTo("test01");
        assertThat(member.getPassword()).isEqualTo("1234");
        assertThat(member.getName()).isEqualTo("김철수");
    }
}