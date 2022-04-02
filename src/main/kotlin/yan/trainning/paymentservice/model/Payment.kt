package yan.trainning.paymentservice.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Payment(@JsonProperty("payment_method") val paymentMethod: PaymentMethod, val value: Long)
