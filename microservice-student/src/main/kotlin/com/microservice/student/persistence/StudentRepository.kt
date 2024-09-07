package com.microservice.student.persistence

import com.microservice.student.entities.Student
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : CrudRepository<Student, Long> {
    @Query("SELECT s FROM Student s WHERE s.courseId = :courseId")
    fun findAllStudents(courseId: Long): List<Student>
//fun findAllByCourseId(courseId: Long): List<Student>

}