package com.barbulescu.json

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

class ObjectMapperFactory {
    fun objectMapper() = jacksonObjectMapper()
}