package com.github.klingsbo.semvermgmt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SemverMgmtApplication

fun main(args: Array<String>) {
	runApplication<SemverMgmtApplication>(*args)
}
