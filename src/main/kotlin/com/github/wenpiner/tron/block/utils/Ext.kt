package com.github.wenpiner.tron.block.utils

import cn.hutool.core.util.StrUtil
import java.math.BigInteger

fun String.cleanHexPrefix() = if (containsHexPrefix()) {
    this.substring(2)
} else this

fun String.toBigIntNoPrefix() = BigInteger(cleanHexPrefix(), 16)

fun String.toBigInt() = toBigIntNoPrefix()

fun String.containsHexPrefix() = isNotBlank() && length > 1 && this[0] == '0' && this[1] == 'x'

fun ByteArray.toBigInt() = BigInteger(this)
