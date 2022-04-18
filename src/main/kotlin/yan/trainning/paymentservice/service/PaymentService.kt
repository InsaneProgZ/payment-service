package yan.trainning.paymentservice.service

import org.springframework.stereotype.Service
import yan.trainning.paymentservice.model.Boleto
import yan.trainning.paymentservice.model.Card
import yan.trainning.paymentservice.model.Payment
import yan.trainning.paymentservice.model.PaymentMethod

@Service
class PaymentService {
    private fun paymentProcess(paymentMethod: Boleto): String {
        return "Boleto Processed"
    }

    private fun paymentProcess(paymentMethod: Card): String {
        return "Card processed"
    }

    fun paymentProcess(paymentMethod: PaymentMethod): String {
        return when (paymentMethod) {
            is Card -> paymentProcess(paymentMethod)
            is Boleto -> paymentProcess(paymentMethod)
            else -> ""
        }

    }
}