package com.microservice.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroserviceEurekaApplication

fun main(args: Array<String>) {
	runApplication<MicroserviceEurekaApplication>(*args)
}
