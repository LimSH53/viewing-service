package com.viewing.viewingservicebackend.viewing.dto;

import java.time.LocalDateTime;

/**
 * 관람 상태 변경 요청 DTO
 */
public record ViewingUpdateRequest(

        /** 관람 여부 */
        Boolean viewingStatus,

        /** 실제 관람 일시 */
        LocalDateTime viewedDate

) {}