package com.example.foodeurekabackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class FoodEurekaBackEndApplication

fun main(args: Array<String>) {
	runApplication<FoodEurekaBackEndApplication>(*args)
}

@RestController
class MessageResource {
	@GetMapping
	fun index(): List<Message> = listOf(
		Message("1", "Hello!"),
		Message("2", "Welcome To Smart Restaurant"),
		Message("3", "Variety Of Meals Available"),
	)
}

data class Message(val id: String?, val text: String)
