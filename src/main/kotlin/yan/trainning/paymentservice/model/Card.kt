package yan.trainning.paymentservice.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName("Card")
class Card : PaymentMethod {
    @JsonProperty("number")
    var number: Long? = null

    constructor(number: Long?) {
        this.number = number
    }

    constructor() {}
}
