package com.viewing.viewingservicebackend.domain.viewing;

import com.viewing.viewingservicebackend.domain.actor.Actor;
import com.viewing.viewingservicebackend.domain.common.BaseEntity;
import jakarta.persistence.*;

/**
 * 관람-배우 연결 엔티티
 */
@Entity
@Table(name = "viewing_cast")
public class ViewingCast extends BaseEntity {
    /** PK */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "viewing_cast_id")
    private Long id;

    /** 관람 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "viewing_id", nullable = false)
    private Viewing viewing;

    /** 배우 */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cast_id", nullable = false)
    private Actor actor;

    /** 배역 타입 (주연/조연/앙상블) */
    @Column(name = "cast_type", length = 30)
    private String castType;
}
