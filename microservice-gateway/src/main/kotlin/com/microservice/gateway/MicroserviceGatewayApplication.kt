package com.microservice.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroserviceGatewayApplication

fun main(args: Array<String>) {
	runApplication<MicroserviceGatewayApplication>(*args)
}
