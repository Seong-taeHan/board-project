package com.sb02.boardproject.entitiy;

import com.sb02.boardproject.entitiy.base.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * 회원정보 Entity
 */

@Getter
@NoArgsConstructor
@RequiredArgsConstructor // Person 객체 주입시 사용
@Entity
@ToString(exclude = "Person") // 양방향 매핑을 막기위해 exclude 사용
public class Member extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long Id;

    @Column(unique = true, updatable = false)
    private String email;

    private String password;

    private String nickname;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;

}
