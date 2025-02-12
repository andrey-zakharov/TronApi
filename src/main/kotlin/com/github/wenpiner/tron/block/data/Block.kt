package com.github.wenpiner.tron.block.data

import com.github.wenpiner.tron.block.data.transaction.Transaction
import com.google.gson.annotations.SerializedName

data class Block(
    @SerializedName("blockID")
    val blockId: String,
    @SerializedName("block_header")
    val blockHeader: BlockHeader,
    @SerializedName("transactions")
    val transactions: List<Transaction>
)
