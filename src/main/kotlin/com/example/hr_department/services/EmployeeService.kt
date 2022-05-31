package com.example.hr_department.services

import com.example.hr_department.datasources.EmployeeRepository
import com.example.hr_department.entity.Employee
import org.springframework.stereotype.Service

@Service
class EmployeeService(private val employeeRepository: EmployeeRepository) {

    fun fetchById(id: Int) = employeeRepository.findById(id)

    fun save(employee: Employee) = employeeRepository.save(employee)

    fun fetchAll(): List<Employee> = employeeRepository.findAll()

    fun getEmployeeByLoginAndPassword(login: String, password: String) =
        employeeRepository.getEmployeeByLoginAndPassword(login, password)

    fun deleteById(id: Int) = employeeRepository.deleteById(id)

}