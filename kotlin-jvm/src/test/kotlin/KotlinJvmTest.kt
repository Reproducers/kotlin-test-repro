package com.javiersc.kotlin.test.repro

import kotlin.test.Test
import kotlin.test.assertTrue

class KotlinJvmTest {

    @Test
    fun test() {
        val value = 1
        assertTrue { value == 1 }
    }
}
