package com.github.wenpiner.tron.block.data.transaction.contract

import com.google.gson.annotations.SerializedName

data class BeanSetAccountIdContract(
    @SerializedName("account_id")
    val accountId: Long,
) : BeanValue()
