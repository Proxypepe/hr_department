package com.example.hr_department.model

import java.time.Instant

data class DeclarationBody (
    val employee_id: Int,
    val name: String,
    val category: String,
    val content: String,
    val creationDate: Instant,
    val status: String,
)