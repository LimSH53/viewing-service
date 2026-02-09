package com.viewing.viewingservicebackend.viewing.dto;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 관람 등록 요청 DTO
 */
public class ViewingCreateRequest {

    /** 공연 ID */
    private Long performanceId;

    /** 공연장 ID (nullable) */
    private Long venueId;

    /** 좌석 ID (nullable) */
    private Long seatId;

    /** 관람 여부 (예정 / 완료) */
    private Boolean viewingStatus;

    /** 실제 관람 일시 */
    private LocalDateTime viewedDate;

    /** 관람 배우 목록 */
    private List<ViewingActorRequest> actors;

    // getter / setter
}