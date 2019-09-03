package io.pivotal.shinyay.test

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

@Tag("unitTest")
class CaliculationTest {

    lateinit var target: Caliculation

    @BeforeEach
    fun configureSystemUnderTest() {
        target = Caliculation()
    }

    // SOURCE: @ValueSource, @EnumSource, @MethodSource, @CsvSource, @CsvFileSource, @ArgumentSource
    @ParameterizedTest(name = "${0} + ${1} = ${2}")
    @CsvSource("0, 0, 0", "1, 2, 3", "4, 5, 9")
    fun parameterSum(arg1: Int, arg2: Int, result: Int) {
        assertEquals(result, target.sum(arg1, arg2)) {"$result should format $arg1 + $arg2"}
    }
}