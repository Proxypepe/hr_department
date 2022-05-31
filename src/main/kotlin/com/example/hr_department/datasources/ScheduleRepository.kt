package com.example.hr_department.datasources;

import com.example.hr_department.entity.Schedule
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface ScheduleRepository : JpaRepository<Schedule, Int> {

    @Query("SELECT s FROM Schedule s WHERE s.employee_id = ?1")
    fun getScheduleByEmployeeId(employee_id: Int): List<Schedule>

}