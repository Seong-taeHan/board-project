package com.sb02.boardproject.entitiy;

import com.sb02.boardproject.entitiy.base.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * 개인정보 Entitiy
 */

@Entity
@ToString
public class Person extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Long id;

    private String firstName;

    private String lastName;

    private int gender;

    private LocalDateTime birthDate;

    private String address;

    private String detailAddress;
}
