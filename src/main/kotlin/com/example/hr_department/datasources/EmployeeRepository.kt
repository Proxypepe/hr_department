package com.example.hr_department.datasources

import com.example.hr_department.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface EmployeeRepository : JpaRepository<Employee, Int> {

    @Query("SELECT e FROM Employee e WHERE e.login = ?1 AND e.password = ?2")
    fun getEmployeeByLoginAndPassword(login: String, password: String): Employee?

}