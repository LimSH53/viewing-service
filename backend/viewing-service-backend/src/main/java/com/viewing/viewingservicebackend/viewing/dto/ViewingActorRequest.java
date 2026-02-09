package com.viewing.viewingservicebackend.viewing.dto;

/**
 * 관람에 포함된 배우 요청 DTO
 */
public record ViewingActorRequest(

        /** 배우 ID */
        Long actorId,

        /** 배역 유형 (주연 / 조연 / 앙상블) */
        String castType

) {}