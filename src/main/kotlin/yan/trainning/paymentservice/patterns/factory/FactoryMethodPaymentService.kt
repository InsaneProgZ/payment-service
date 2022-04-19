package yan.trainning.paymentservice.patterns.factory

import org.springframework.stereotype.Service
import yan.trainning.paymentservice.model.Boleto
import yan.trainning.paymentservice.model.Card
import yan.trainning.paymentservice.model.PaymentMethod
import yan.trainning.paymentservice.patterns.strategy.StrategyCardInstallments
import yan.trainning.paymentservice.service.*

@Service
class FactoryMethodPaymentService {


    fun factory (paymentMethod: PaymentMethod): IPaymentService {
        return when (paymentMethod) {
            is Card -> {
                if ((paymentMethod.installments ?: 0) <= 1)
                    StrategyCardInstallments(CardNoInstallemtnsStrategyService())
                else
                    StrategyCardInstallments(CardInstallmentsStrategyService())
                }
            is Boleto -> BoletoService()
            else -> throw IllegalArgumentException()
        }

    }


}