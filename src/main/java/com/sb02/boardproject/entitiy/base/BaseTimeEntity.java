package com.sb02.boardproject.entitiy.base;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass // baseEntitiy를 상속한 엔티티들을 아래 필드들을 컬럼으로 인식하게끔 설정
@EntityListeners(AuditingEntityListener.class) //Auditing 기능 추가(시간에 대해서 자동으로 값을 추가)
public class BaseTimeEntity {

    @CreatedDate
    private LocalDateTime createAt;

    @LastModifiedDate
    private LocalDateTime updateAt;
}
