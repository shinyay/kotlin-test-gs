package io.pivotal.shinyay.test

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

@Tag("unitTest")
class HelloWorldTest {

    lateinit var service: HelloWorld

    @BeforeEach
    fun configureSystemUnderTest() {
        service = HelloWorld()
    }

    @Test
    @DisplayName("[UT] Should return the correct message")
    fun shouldReturnCorrectMessage() {

        println(service.getGreeting())
        assertThat(service.getGreeting()).isEqualTo("Hello!")
    }
}