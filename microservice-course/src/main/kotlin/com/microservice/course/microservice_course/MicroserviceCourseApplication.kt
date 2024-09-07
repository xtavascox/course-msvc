package com.microservice.course.microservice_course

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class MicroserviceCourseApplication

fun main(args: Array<String>) {
	runApplication<MicroserviceCourseApplication>(*args)
}
