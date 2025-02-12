package com.github.wenpiner.tron.block

import com.github.wenpiner.tron.block.data.Address
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class AddressTest {
    @Test
    fun fromAddress() {
        val address = Address("5a523b449890854c8fc460ab602df9f31fe4293f")
//        val address = Address("a3261ae4e7f3c5e81bd4e9c6c1f86caefbfc7317")
        println("Hex: ${address.toHexAddress()}")
        println("Base58: $address")
//        assertEquals("TR7NHqjeKQxGTCi8q8ZY4pL8otSzgjLj6t", address.toString())
        assertEquals("TJCnKsPa7y5okkXvQAidZBzqx3QyQ6sxMW", address.toString())
    }
}