package com.yutaka0m.cypherhelloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CypherHelloWorldApplication

fun main(args: Array<String>) {
    runApplication<CypherHelloWorldApplication>(*args)
}
