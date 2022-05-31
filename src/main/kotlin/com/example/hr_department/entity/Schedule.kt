package com.example.hr_department.entity

import java.time.Instant
import javax.persistence.*

@Table(name = "schedule")
@Entity
data class Schedule(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    @Column(name = "employee_id", nullable = false)
    val employee_id: Int,

    @Column(name = "category", nullable = false, length = 45)
    val category: String,

    @Column(name = "content", nullable = false, length = 255)
    val content: String,

    @Column(name = "date", nullable = false)
    val date: Instant,
)
