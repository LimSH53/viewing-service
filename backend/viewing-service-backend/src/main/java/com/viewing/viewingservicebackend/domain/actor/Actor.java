package com.viewing.viewingservicebackend.domain.actor;

import com.viewing.viewingservicebackend.domain.common.BaseEntity;
import jakarta.persistence.*;

/**
 * 배우 엔티티
 */
@Entity
@Table(name = "actor")
public class Actor extends BaseEntity {

    /** 배우 PK */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /** 배우명 */
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    /** 선호 유형 */
    @Column(name = "favorite_type", length = 50)
    private String favoriteType;
}
