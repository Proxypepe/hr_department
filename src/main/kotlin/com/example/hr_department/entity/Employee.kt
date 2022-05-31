package com.example.hr_department.entity

import javax.persistence.*

@Table(name = "employee")
@Entity
data class Employee (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "Employee_id")
    val resignations: List<Declaration> = emptyList(),

    @Column(name = "first_name", nullable = false, length = 45)
    val firstName: String,

    @Column(name = "second_name", nullable = false, length = 45)
    val secondName: String,

    @Column(name = "email", nullable = false, length = 45)
    val email: String,

    @Column(name = "age", nullable = false)
    val age: Int,

    @Column(name = "job_name", nullable = false, length = 45)
    val jobName: String,

    @Column(name = "gender", length = 45)
    val gender: String,

    @Column(name = "department", nullable = false, length = 45)
    val department: String,

    @Column(name = "salary", nullable = false, length = 45)
    val salary: String,

    @Column(name = "role", nullable = false, length = 45)
    val role: String,

    @Column(name = "password", nullable = false, length = 45)
    val password: String,

    @Column(name = "login", nullable = false, length = 45)
    val login: String,
)