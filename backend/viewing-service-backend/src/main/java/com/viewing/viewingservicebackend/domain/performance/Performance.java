package com.viewing.viewingservicebackend.domain.performance;

import com.viewing.viewingservicebackend.domain.common.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * 공연 엔티티
 */
@Entity
@Table(name = "performance")
public class Performance extends BaseEntity {

    /** 공연 PK */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "performance_id")
    private Long id;

    /** 공연명 */
    @Column(name = "title", nullable = false, length = 100)
    private String title;

    /** 공연 시작 일시 */
    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate;

    /** 공연 종료 일시 */
    @Column(name = "end_date")
    private LocalDateTime endDate;

    /** 공연 상태 (예정, 관람완료 등) */
    @Column(name = "status", length = 30)
    private String status;
}
