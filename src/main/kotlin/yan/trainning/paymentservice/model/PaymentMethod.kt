package yan.trainning.paymentservice.model

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo


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