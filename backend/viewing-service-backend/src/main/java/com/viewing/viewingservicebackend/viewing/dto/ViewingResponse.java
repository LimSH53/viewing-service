package com.viewing.viewingservicebackend.viewing.dto;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 관람 조회 응답 DTO
 */
public record ViewingResponse(

        /** 관람 ID */
        Long viewingId,

        /** 공연명 */
        String performanceName,

        /** 관람 여부 */
        Boolean viewingStatus,

        /** 실제 관람 일시 */
        LocalDateTime viewedDate,

        /** 좌석 코드 */
        String seatCode,

        /** 관람한 배우 목록 */
        List<ViewingActorResponse> actors

) {}