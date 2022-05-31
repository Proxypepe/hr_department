package com.example.hr_department.datasources

import com.example.hr_department.entity.Declaration
import com.example.hr_department.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface DeclarationRepository : JpaRepository<Declaration, Int> {

    @Query("SELECT d FROM Declaration d WHERE d.employee_id = ?1")
    fun getDeclarationsByEmployeeId(employee_id: Int): List<Declaration>?


}