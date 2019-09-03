package io.pivotal.shinyay.test

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Tag("integrationTest")
class HelloWorldIntegrationTest {

    lateinit var service: HelloWorld

    @BeforeEach
    fun configureSystemUnderTest() {
        service = HelloWorld()
    }

    @Test
    @DisplayName("[IT] Should return the correct message")
    fun shouldReturnCorrectMessage() {

        println(service.getGreeting())
        Assertions.assertThat(service.getGreeting()).isEqualTo("Hello!")
    }
}