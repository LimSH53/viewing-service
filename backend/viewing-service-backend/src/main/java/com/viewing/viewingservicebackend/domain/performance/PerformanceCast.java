package com.viewing.viewingservicebackend.domain.performance;

import com.viewing.viewingservicebackend.domain.actor.Actor;
import com.viewing.viewingservicebackend.domain.common.BaseEntity;
import jakarta.persistence.*;

/**
 * 공연-배우 연결 엔티티
 */
@Entity
@Table(name = "performance_cast")
public class PerformanceCast extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performance_id", nullable = false)
    private Performance performance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "actor_id", nullable = false)
    private Actor actor;

    @Column(name = "role_name", length = 50)
    private String roleName;
}
