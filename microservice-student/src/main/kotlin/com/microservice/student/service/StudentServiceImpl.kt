package com.microservice.student.service

import com.microservice.student.entities.Student
import com.microservice.student.persistence.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl : IStudentService {

    @Autowired
    lateinit var studentRepository: StudentRepository

    override fun findAll(): List<Student> {
        return studentRepository.findAll() as List<Student>
    }

    override fun findById(id: Long): Student {
        return studentRepository.findById(id).orElseThrow()
    }

    override fun save(student: Student) {
        studentRepository.save(student)
    }

    override fun findByCourseId(courseId: Long): List<Student> {
        return studentRepository.findAllStudents(courseId)
    }

}