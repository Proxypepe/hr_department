package com.example.hr_department.controllers

import com.example.hr_department.entity.Employee
import com.example.hr_department.model.AuthDto
import com.example.hr_department.model.EmployeeBody
import com.example.hr_department.services.EmployeeService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("employee")
class EmployeeController(private val employeeService: EmployeeService) {

    @PostMapping("/auth")
    fun auth(@RequestBody authParams: AuthDto): Employee? =
        employeeService.getEmployeeByLoginAndPassword(authParams.login, authParams.password)


    @PostMapping("/register")
    fun createEmployee(@RequestBody employee: EmployeeBody) = employeeService.save(
        employee = Employee(
            firstName = employee.firstName,
            secondName = employee.secondName,
            email = employee.email,
            age = employee.age,
            jobName = employee.jobName,
            gender = employee.gender,
            department = employee.department,
            salary = employee.salary,
            role = employee.role,
            password = employee.password,
            login = employee.login,
        )
    )


    @GetMapping("/all")
    fun getAllEmployees(): List<Employee> {
        return employeeService.fetchAll()
    }

    // TODO: Add put method
}
