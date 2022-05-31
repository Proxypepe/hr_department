package com.example.hr_department.services

import com.example.hr_department.datasources.DeclarationRepository
import com.example.hr_department.entity.Declaration
import org.springframework.stereotype.Service

@Service
class DeclarationService(private val declarationRepository: DeclarationRepository) {
    fun save(declaration: Declaration) = declarationRepository.save(declaration)

    fun fetchAll(): List<Declaration> = declarationRepository.findAll()

    fun getDeclarationByEmployee_id(employee_id: Int) = declarationRepository.getDeclarationByEmployee_id(employee_id)

}