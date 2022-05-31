package com.example.hr_department.model

import java.time.Instant

data class ScheduleBody (
    val employee_id: Int,
    val category: String,
    val content: String,
    val date: Instant,
)
