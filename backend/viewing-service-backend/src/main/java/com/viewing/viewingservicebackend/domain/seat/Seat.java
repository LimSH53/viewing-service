package com.viewing.viewingservicebackend.domain.seat;

import com.viewing.viewingservicebackend.domain.common.BaseEntity;
import com.viewing.viewingservicebackend.domain.venue.Venue;
import jakarta.persistence.*;

/**
 * 좌석 엔티티
 */
@Entity
@Table(name = "seat")
public class Seat extends BaseEntity {
    /** 좌석 PK */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private Long id;

    /** 공연장 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venue_id", nullable = false)
    private Venue venue;

    /** 좌석 등급(예: VIP, R, S 등) */
    @Column(name = "seat_grade", length = 50)
    private String seatGrade;

    /** 좌석 번호 (예: 1층 A구역 1번) */
    @Column(name = "seat_code", nullable = false, length = 20)
    private String seatCode;
}
