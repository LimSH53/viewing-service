package com.viewing.viewingservicebackend.domain.viewing;

import com.viewing.viewingservicebackend.domain.common.BaseEntity;
import com.viewing.viewingservicebackend.domain.performance.Performance;
import com.viewing.viewingservicebackend.domain.seat.Seat;
import com.viewing.viewingservicebackend.domain.venue.Venue;
import jakarta.persistence.*;
import lombok.Setter;

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

    /** 공연
     * -- SETTER --
     *  공연 설정
     */
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performance_id", nullable = false)
    private Performance performance;

    /** 공연장
     * -- SETTER --
     *  공연장 설정
     */
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venue_id")
    private Venue venue;

    /** 좌석
     * -- SETTER --
     *  좌석 설정
     */
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seat_id")
    private Seat seat;

    /** 관람 여부 (관람 예정 / 관람 완료) */
    @Column(name = "viewing_status", nullable = false)
    private Boolean viewingStatus;

    /** 실제 관람 일시 */
    @Column(name = "viewed_date")
    private LocalDateTime viewedDate;

    /**
     * JPA 기본 생성자
     */
    protected Viewing() {
    }

    /**
     * 관람 ID 조회
     */
    public Long getId() {
        return id;
    }

    /**
     * 공연 조회
     */
    public Performance getPerformance() {
        return performance;
    }

    /**
     * 공연장 조회
     */
    public Venue getVenue() {
        return venue;
    }

    /**
     * 좌석 조회
     */
    public Seat getSeat() {
        return seat;
    }

    /**
     * 관람 상태 조회
     */
    public Boolean getViewingStatus() {
        return viewingStatus;
    }

    /**
     * 실제 관람 일시 조회
     */
    public LocalDateTime getViewedDate() {
        return viewedDate;
    }

    /**
     * 관람 예정 상태로 설정
     */
    public void markAsPlanned() {
        this.viewingStatus = false;
        this.viewedDate = null;
    }

    /**
     * 관람 완료 상태로 변경
     * - 실제 관람 일시 기록
     */
    public void markAsViewed(LocalDateTime viewedDate) {
        this.viewingStatus = true;
        this.viewedDate = viewedDate;
    }
}
