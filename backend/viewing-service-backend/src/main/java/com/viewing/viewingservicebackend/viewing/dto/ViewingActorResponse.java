package com.viewing.viewingservicebackend.viewing.dto;

/**
 * 관람 배우 응답 DTO
 */
public record ViewingActorResponse(

        /** 배우 이름 */
        String actorName,

        /** 배역 유형 */
        String castType

) {}