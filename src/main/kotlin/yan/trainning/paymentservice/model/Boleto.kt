package yan.trainning.paymentservice.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName("Boleto")
data class Boleto(
    @JsonProperty("value")
    var value: Long? = null
) : PaymentMethod
