package com.example.hr_department.services

import com.example.hr_department.datasources.ScheduleRepository
import com.example.hr_department.entity.Schedule
import org.springframework.stereotype.Service

@Service
class ScheduleService(private val scheduleRepository: ScheduleRepository ) {
    fun save(schedule: Schedule) = scheduleRepository.save(schedule)

    fun fetchAll(): List<Schedule> = scheduleRepository.findAll()

    fun getSchedulesByEmployee(employee_id: Int) = scheduleRepository.getScheduleByEmployeeId(employee_id)

    fun deleteById(id: Int) = scheduleRepository.deleteById(id)
}