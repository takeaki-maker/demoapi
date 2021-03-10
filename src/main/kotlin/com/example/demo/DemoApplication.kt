package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
open class DemoApplication {
	companion object {
    @JvmStatic fun main(args: Array<String>) {
    	SpringApplication.run(DemoApplication::class.java, *args)
    }
  }
}
