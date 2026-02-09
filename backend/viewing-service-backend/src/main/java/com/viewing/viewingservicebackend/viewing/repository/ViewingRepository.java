package com.viewing.viewingservicebackend.viewing.repository;

import com.viewing.viewingservicebackend.domain.viewing.Viewing;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 관람 Repository
 * - Viewing 엔티티에 대한 DB 접근 담당
 * - 기본 CRUD 기능 제공
 */
public interface ViewingRepository extends JpaRepository<Viewing, Long> {
}
