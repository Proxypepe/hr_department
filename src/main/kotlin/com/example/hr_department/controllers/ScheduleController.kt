package com.example.hr_department.controllers

import com.example.hr_department.entity.Schedule
import com.example.hr_department.model.ScheduleBody
import com.example.hr_department.services.ScheduleService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("schedule")
class ScheduleController(private val scheduleService: ScheduleService) {

    @PostMapping("/add")
    fun createSchedule(@RequestBody schedule: ScheduleBody) = scheduleService.save(
        Schedule(
            employee_id = schedule.employee_id,
            category = schedule.category,
            content = schedule.content,
            date = schedule.date,
        )
    )

    @GetMapping("/employee/{id}")
    fun getSchedulesByEmployee(@PathVariable id: Int) = scheduleService.getSchedulesByEmployee(id)


    @DeleteMapping("/delete/{id}")
    fun deleteScheduleById(@PathVariable id: Int) = scheduleService.deleteById(id)

}