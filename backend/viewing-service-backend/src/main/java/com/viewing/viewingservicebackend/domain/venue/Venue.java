package com.viewing.viewingservicebackend.domain.venue;

import com.viewing.viewingservicebackend.domain.common.BaseEntity;
import jakarta.persistence.*;

/**
 * 공연장 엔티티
 */
@Entity
@Table(name = "venue")
public class Venue extends BaseEntity {
    /** 공연장 PK */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "venue_id")
    private Long id;

    /** 공연장명 */
    @Column(name = "name", nullable = false, length = 100)
    private String name;

}
