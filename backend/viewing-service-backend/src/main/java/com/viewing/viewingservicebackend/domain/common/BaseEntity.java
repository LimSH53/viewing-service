package com.viewing.viewingservicebackend.domain.common;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

/**
 * 공통 엔티티 베이스 클래스
 *  - 생성일 / 수정일 등 공통 컬럼 관리 목적
 */
@MappedSuperclass
public abstract class BaseEntity {

    /* 생성일 */
    @Column(name = "create_date", nullable = false)
    protected LocalDateTime createDate;

    /* 수정일 */
    @Column(name = "modified_date", nullable = false)
    protected LocalDateTime modifiedDate;

}
