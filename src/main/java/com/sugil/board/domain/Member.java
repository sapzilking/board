package com.sugil.board.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long sno;

    String id;

    String password;

    String name;

    @Builder
    public Member(long sno, String id, String password, String name) {
        this.sno = sno;
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
