package com.viewing.viewingservicebackend.viewing.service;

import com.viewing.viewingservicebackend.viewing.dto.ViewingCreateRequest;
import com.viewing.viewingservicebackend.viewing.dto.ViewingResponse;
import com.viewing.viewingservicebackend.viewing.dto.ViewingUpdateRequest;

import java.util.List;

/**
 * 관람(Viewing) 유스케이스 정의
 * - 비즈니스 흐름의 진입점
 * - Controller는 이 인터페이스만 의존
 */
public interface ViewingService {

    /**
     * 관람 등록
     *
     * @param request 관람 생성 요청 DTO
     * @return 생성된 관람 ID
     */
    Long createViewing(ViewingCreateRequest request);

    /**
     * 관람 단건 조회
     *
     * @param viewingId 관람 ID
     * @return 관람 조회 응답 DTO
     */
    ViewingResponse getViewing(Long viewingId);

    /**
     * 관람 목록 조회
     *
     * @return 관람 목록
     */
    List<ViewingResponse> getViewings();

    /**
     * 관람 정보 수정
     *
     * @param viewingId 관람 ID
     * @param request 수정 요청 DTO
     */
    void updateViewing(Long viewingId, ViewingUpdateRequest request);
}
