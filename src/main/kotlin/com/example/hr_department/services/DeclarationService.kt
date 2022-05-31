package com.example.hr_department.services

import com.example.hr_department.datasources.DeclarationRepository
import com.example.hr_department.entity.Declaration
import org.springframework.stereotype.Service

@Service
class DeclarationService(private val declarationRepository: DeclarationRepository) {
    fun fetchById(id: Int) = declarationRepository.findById(id)

    fun save(declaration: Declaration) = declarationRepository.save(declaration)

    fun fetchAll(): List<Declaration> = declarationRepository.findAll()

    fun getDeclarationsByEmployeeId(employee_id: Int) = declarationRepository.getDeclarationsByEmployeeId(employee_id)

    fun deleteById(id: Int) = declarationRepository.deleteById(id)
}