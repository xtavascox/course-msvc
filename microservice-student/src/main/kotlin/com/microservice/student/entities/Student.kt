package com.microservice.student.entities

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor


@Data
@Entity
@Builder
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    var name: String = ""

    @Column(name = "last_name")
    var lastName: String = ""
    var email: String = ""

    @Column(name = "course_id")
    var courseId: Long = 0

}