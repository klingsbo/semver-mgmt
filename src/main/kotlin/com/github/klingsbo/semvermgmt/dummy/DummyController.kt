package com.github.klingsbo.semvermgmt.dummy

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dummy")
class DummyController {

    @PostMapping
    fun getDummy(@RequestBody request: DummyRequest): DummyResponse = DummyResponse("Hey, ${request.message}")

}