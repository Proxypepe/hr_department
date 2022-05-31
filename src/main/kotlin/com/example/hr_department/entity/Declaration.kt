package com.example.hr_department.entity

import java.time.Instant
import javax.persistence.*

@Table(name = "declaration")
@Entity
data class Declaration (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(name = "employee_id", nullable = false)
    val employee_id: Int,

    @Column(name = "name", length = 255)
    val name: String,

    @Column(name = "category", nullable = false, length = 45)
    val category: String,

    @Column(name = "content", nullable = false, length = 255)
    val content: String,

    @Column(name = "creation_date", nullable = false)
    val creationDate: Instant,

    @Column(name = "status", nullable = false, length = 127)
    val status: String,
)