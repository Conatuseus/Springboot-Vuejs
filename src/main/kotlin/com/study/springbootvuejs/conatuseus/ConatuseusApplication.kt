package com.study.springbootvuejs.conatuseus

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration(exclude={ DataSourceAutoConfiguration.class})
class ConatuseusApplication

fun main(args: Array<String>) {
    runApplication<ConatuseusApplication>(*args)
}
