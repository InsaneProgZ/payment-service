package yan.trainning.paymentservice.patterns.strategy

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import yan.trainning.paymentservice.model.PaymentMethod
import yan.trainning.paymentservice.service.CardInstallmentsStrategyService
import yan.trainning.paymentservice.service.CardStrategyService
import yan.trainning.paymentservice.service.IPaymentService


class StrategyCardInstallments(var cardStrategyService: CardStrategyService) : CardStrategyService(), IPaymentService {


    override fun setStrategy(cardStrategyService: CardStrategyService) {
        this.cardStrategyService = cardStrategyService
    }

    override fun paymentProcess(paymentMethod: PaymentMethod): String {
      return cardStrategyService.paymentProcess(paymentMethod)
    }

    override fun calculateTax(): String {
       return cardStrategyService.calculateTax()
   }


}
