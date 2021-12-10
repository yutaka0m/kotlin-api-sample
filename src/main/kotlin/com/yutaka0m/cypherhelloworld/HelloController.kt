package com.yutaka0m.cypherhelloworld

import com.yutaka0m.cypherhelloworld.entity.HelloReply
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/")
    fun helloWorld() = "Hello Blue"

    @GetMapping("/greeting")
    fun greeting(@RequestParam name: String): HelloReply {
        return HelloReply(message = "Hello, $name")
    }
}
