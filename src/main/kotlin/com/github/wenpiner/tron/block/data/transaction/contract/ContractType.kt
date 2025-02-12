package com.github.wenpiner.tron.block.data.transaction.contract


enum class ContractType(val str: String, val clazz: Class<*>) {
            AccountCreateContract("type.googleapis.com/protocol.AccountCreateContract", BeanAccountCreateContract::class.java),
    TransferContract("type.googleapis.com/protocol.TransferContract", BeanTransferContract::class.java),

    TransferAssetContract("type.googleapis.com/protocol.TransferAssetContract", BeanTransferAssetContract::class.java),

    VoteAssetContract("type.googleapis.com/protocol.VoteAssetContract", BeanVoteAssetContract::class.java),

    VoteWitnessContract("type.googleapis.com/protocol.VoteWitnessContract", BeanVoteWitnessContract::class.java),

    WitnessCreateContract("type.googleapis.com/protocol.WitnessCreateContract", BeanWitnessCreateContract::class.java),

    AssetIssueContract("type.googleapis.com/protocol.AssetIssueContract", BeanAssetIssueContract::class.java),

    WitnessUpdateContract(
        "type.googleapis.com/protocol.WitnessUpdateContract", BeanWitnessUpdateContract::class.java
    ),
    ParticipateAssetIssueContract(
        "type.googleapis.com/protocol.ParticipateAssetIssueContract",
        BeanParticipateAssetIssueContract::class.java
    ),
    AccountUpdateContract("type.googleapis.com/protocol.AccountUpdateContract", BeanAccountUpdateContract::class.java),
    FreezeBalanceContract("type.googleapis.com/protocol.FreezeBalanceContract", BeanFreezeBalanceContract::class.java),
    UnfreezeBalanceContract(
        "type.googleapis.com/protocol.UnfreezeBalanceContract",
        BeanUnfreezeBalanceContract::class.java
    ),
    WithdrawBalanceContract(
        "type.googleapis.com/protocol.WithdrawBalanceContract",
        BeanWithdrawBalanceContract::class.java
    ),
    UnfreezeAssetContract("type.googleapis.com/protocol.UnfreezeAssetContract", BeanUnfreezeAssetContract::class.java),
    UpdateAssetContract("type.googleapis.com/protocol.UpdateAssetContract", BeanUpdateAssetContract::class.java),
    ProposalCreateContract(
        "type.googleapis.com/protocol.ProposalCreateContract",
        BeanProposalCreateContract::class.java
    ),
    ProposalApproveContract(
        "type.googleapis.com/protocol.ProposalApproveContract",
        BeanProposalApproveContract::class.java
    ),
    ProposalDeleteContract(
        "type.googleapis.com/protocol.ProposalDeleteContract",
        BeanProposalDeleteContract::class.java
    ),

    SetAccountIdContract("type.googleapis.com/protocol.SetAccountIdContract", BeanSetAccountIdContract::class.java),

//        CustomContract("type.googleapis.com/protocol.CustomContract", BeanCustomContract::class.java),
    CreateSmartContract("type.googleapis.com/protocol.CreateSmartContract", BeanCreateSmartContract::class.java),
    TriggerSmartContract("type.googleapis.com/protocol.TriggerSmartContract", BeanTriggerSmartContract::class.java),

//        GetContract("type.googleapis.com/protocol.GetContract", BeanGetContract::class.java),
//    UpdateSettingContract("type.googleapis.com/protocol.UpdateSettingContract", BeanUpdateSettingContract::class.java),
//    ExchangeCreateContract("type.googleapis.com/protocol.ExchangeCreateContract", BeanExchangeCreateContract::class.java),
//    ExchangeInjectContract("type.googleapis.com/protocol.ExchangeInjectContract", BeanExchangeInjectContract::class.java),
//    ExchangeWithdrawContract("type.googleapis.com/protocol.ExchangeWithdrawContract", BeanExchangeWithdrawContract::class.java),
//    ExchangeTransactionContract("type.googleapis.com/protocol.ExchangeTransactionContract", BeanExchangeTransactionContract::class.java),
//    UpdateEnergyLimitContract("type.googleapis.com/protocol.UpdateEnergyLimitContract", BeanUpdateEnergyLimitContract::class.java),
//    AccountPermissionUpdateContract("type.googleapis.com/protocol.AccountPermissionUpdateContract", BeanAccountPermissionUpdateContract::class.java),
//    ClearABIContract("type.googleapis.com/protocol.ClearABIContract", BeanClearABIContract::class.java),
//    UpdateBrokerageContract("type.googleapis.com/protocol.UpdateBrokerageContract", BeanUpdateBrokerageContract::class.java),
//    ShieldedTransferContract("type.googleapis.com/protocol.ShieldedTransferContract", BeanShieldedTransferContract::class.java),
//    MarketSellAssetContract("type.googleapis.com/protocol.MarketSellAssetContract", BeanMarketSellAssetContract::class.java),
//    MarketCancelOrderContract("type.googleapis.com/protocol.MarketCancelOrderContract", BeanMarketCancelOrderContract::class.java),
//    FreezeBalanceV2Contract("type.googleapis.com/protocol.FreezeBalanceV2Contract", BeanFreezeBalanceV2Contract::class.java),
//    UnfreezeBalanceV2Contract("type.googleapis.com/protocol.UnfreezeBalanceV2Contract", BeanUnfreezeBalanceV2Contract::class.java),
//    WithdrawExpireUnfreezeContract("type.googleapis.com/protocol.WithdrawExpireUnfreezeContract", BeanWithdrawExpireUnfreezeContract::class.java),
    DelegateResourceContract(
        "type.googleapis.com/protocol.DelegateResourceContract",
        BeanDelegateResourceContract::class.java
    ),
    UnDelegateResourceContract(
        "type.googleapis.com/protocol.UnDelegateResourceContract",
        BeanUnDelegateResourceContract::class.java
    ),
//    CancelAllUnfreezeV2Contract("type.googleapis.com/protocol.CancelAllUnfreezeV2Contract", BeanCancelAllUnfreezeV2Contract::class.java),
}
