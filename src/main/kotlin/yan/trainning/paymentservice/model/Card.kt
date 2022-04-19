package yan.trainning.paymentservice.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName("Card")

data class Card(
    @JsonProperty("number")
    var number: Long?,

    @JsonProperty("installments")
    var installments: Int?
) : PaymentMethod
