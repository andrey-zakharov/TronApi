package com.github.wenpiner.tron.block.data.transaction

import com.google.gson.annotations.SerializedName

data class Ret(
    @SerializedName("contractRet")
    val contractRet: ContractRet,
    @SerializedName("ret")
    val ret: RetResult
)