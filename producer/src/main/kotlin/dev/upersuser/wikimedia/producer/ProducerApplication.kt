package dev.upersuser.wikimedia.producer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ProducerApplication

fun main(args: Array<String>) {
    runApplication<ProducerApplication>(*args)
}
