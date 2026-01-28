package com.viewing.viewingservicebackend.domain.viewing;

import com.viewing.viewingservicebackend.domain.common.BaseEntity;
import com.viewing.viewingservicebackend.domain.performance.Performance;
import com.viewing.viewingservicebackend.domain.seat.Seat;
import com.viewing.viewingservicebackend.domain.venue.Venue;
import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * 관람 엔티티
 */
@Entity
@Table(name = "viewing")
public class Viewing extends BaseEntity {
    /** 관람 PK */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "viewing_id")
    private Long id;

    /** 공연 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performance_id", nullable = false)
    private Performance performance;

    /** 공연장 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venue_id")
    private Venue venue;

    /** 좌석 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_id")
    private Seat seat;

    /** 관람 여부 (관람 예정 / 관람 완료) */
    @Column(name = "viewing_status", nullable = false)
    private Boolean viewingStatus;

    /** 실제 관람 일시 */
    @Column(name = "viewed_date")
    private LocalDateTime viewedDate;
}
