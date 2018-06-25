package test

import kotlin.test.Test
import kotlin.test.assertEquals

class SomethingTest {

    @Test
    fun testSomeFun() {
        assertEquals(listOf(1, 9, 25), someFun(listOf(1, 2, 3, 4, 5)))
    }
}