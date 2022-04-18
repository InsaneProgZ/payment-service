package yan.trainning.paymentservice.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonTypeName
import com.fasterxml.jackson.annotation.JsonValue
import org.springframework.stereotype.Component


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "payment_type"
)
@JsonSubTypes(
    JsonSubTypes.Type(value = Boleto::class, name = "Boleto"),
    JsonSubTypes.Type(value = Card::class, name = "Card")
)
interface PaymentMethod {
}