package com.microservice.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class MicroserviceEurekaApplication

fun main(args: Array<String>) {
	runApplication<MicroserviceEurekaApplication>(*args)
}
