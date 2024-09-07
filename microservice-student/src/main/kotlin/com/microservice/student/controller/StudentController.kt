package com.microservice.student.controller

import com.microservice.student.entities.Student
import com.microservice.student.service.IStudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/student")
class StudentController {

    @Autowired
    lateinit var studentService: IStudentService

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    fun save(@RequestBody student: Student) {
        studentService.save(student)
    }

    @GetMapping("/all")
    fun findAll(): ResponseEntity<Any> {
        var students = studentService.findAll()
        println(students)
        return ResponseEntity.ok(studentService.findAll())
    }

    @GetMapping("/search/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Any> {
        return ResponseEntity.ok(studentService.findById(id))
    }
}