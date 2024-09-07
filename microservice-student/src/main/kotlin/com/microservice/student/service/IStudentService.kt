package com.microservice.student.service

import com.microservice.student.entities.Student

interface IStudentService {
    fun findAll(): List<Student>
    fun findById(id:Long): Student
    fun save(student: Student)
    fun findByCourseId(courseId: Long):List<Student>

}