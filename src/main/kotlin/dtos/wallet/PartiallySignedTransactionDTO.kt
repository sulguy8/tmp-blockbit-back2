package com.sg.dtos.wallet

import kotlinx.serialization.Serializable

@Serializable
data class PartiallySignedTransactionDTO(
    var transactionHex: String = "",
    var signatureHex: String = "",
    var publicKeyHex: String = "",
    var redeemScriptHex: String = ""
)