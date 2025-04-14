package com.drewjya.crud_api.entity

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "project")
class Project {

    @Id
    @GeneratedValue(generator = "project_sequence_id", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "project_sequence_id", sequenceName = "project_sequence_id", allocationSize = 1)
    val id: Long=0;


    val createdAt: Date = Date();
}