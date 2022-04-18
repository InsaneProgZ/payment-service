package yan.trainning.paymentservice.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName("Boleto")
class Boleto : PaymentMethod {
    @JsonProperty("value")
    var value: Long? = null

    constructor(value: Long?) {
        this.value = value
    }

    constructor() {}
}
