package com.github.wenpiner.tron.block.data.transaction.contract

import com.github.wenpiner.tron.block.data.Address
import com.github.wenpiner.tron.block.serializer.StringToAddressAdapter
import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName

data class BeanCreateSmartContract(
    @SerializedName("new_contract")
    val newContract: NewContract,
) : BeanValue()


data class NewContract(
    @SerializedName("bytecode")
    val bytecode: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("origin_address")
    @JsonAdapter(value = StringToAddressAdapter::class)
    val originAddress: Address,
    @SerializedName("origin_energy_limit")
    val originEnergyLimit: Long,
    @SerializedName("abi")
    val abi: Abi,
)

data class Abi(
    @SerializedName("entrys")
    val entrys: List<Entry>
)

data class Entry(
    @SerializedName("inputs")
    val inputs: List<Input>? = null,
    @SerializedName("stateMutability")
    val stateMutability: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("outputs")
    val outputs: List<Output>? = null,
)

data class Input(
    @SerializedName("name")
    val name: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("indexed")
    val indexed: Boolean? = null
)

data class Output(
    @SerializedName("name")
    val type: String
)