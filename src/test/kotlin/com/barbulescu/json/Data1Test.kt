package com.barbulescu.json

import com.fasterxml.jackson.module.kotlin.readValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Data1Test {

    private val message = """{"n":"n1"}"""
    private val data = Data1("n1")

    @Test
    fun serialize() {
        val text = ObjectMapperFactory().objectMapper().writeValueAsString(data)
        assertThat(text).isEqualTo(message)
    }
    @Test
    fun deserialize() {
        val obj:Data1 = ObjectMapperFactory().objectMapper().readValue(message)
        assertThat(obj).isEqualTo(data)
    }
}