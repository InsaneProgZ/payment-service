package yan.trainning.paymentservice.service

import org.springframework.stereotype.Service
import yan.trainning.paymentservice.model.PaymentMethod


abstract class CardStrategyService : IPaymentService{
    override fun paymentProcess(paymentMethod: PaymentMethod): String {
        return "Card Processed"
    }
    abstract override fun calculateTax() : String

    open fun setStrategy(cardStrategyService: CardStrategyService)  {}
}