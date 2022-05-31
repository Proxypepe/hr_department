package com.example.hr_department.controllers

import com.example.hr_department.entity.Declaration
import com.example.hr_department.model.DeclarationBody
import com.example.hr_department.services.DeclarationService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("declaration")
class DeclarationController(private val declarationService: DeclarationService) {

    @PostMapping("/add")
    fun createDeclaration(@RequestBody declaration: DeclarationBody) = declarationService.save(
        Declaration(
            employee_id = declaration.employee_id,
            name = declaration.name,
            category = declaration.category,
            content = declaration.content,
            creationDate = declaration.creationDate,
            status = declaration.status,
        )
    )

    @GetMapping("/all")
    fun getAllDeclarations() = declarationService.fetchAll()

    @GetMapping("/employee/{id}")
    fun getDeclarationsByEmployeeId(@PathVariable id: Int) = declarationService.getDeclarationsByEmployeeId(id)

    @PutMapping("/update/{id}")
    fun updateDeclaration(@RequestBody declaration: DeclarationBody, @PathVariable id: Int): Optional<Declaration> =
        declarationService.fetchById(id).map {
            declarationService.save(
                it.copy(
                    employee_id = declaration.employee_id,
                    name = declaration.name,
                    category = declaration.category,
                    content = declaration.content,
                    creationDate = declaration.creationDate,
                    status = declaration.status,
                )
            )
        }

    @DeleteMapping("/delete/{id}")
    fun deleteDeclarationById(@PathVariable id: Int) = declarationService.deleteById(id)

}
