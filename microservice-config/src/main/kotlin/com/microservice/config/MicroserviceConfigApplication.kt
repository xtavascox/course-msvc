package com.microservice.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroserviceConfigApplication

fun main(args: Array<String>) {
	runApplication<MicroserviceConfigApplication>(*args)
}
