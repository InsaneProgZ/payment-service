package yan.trainning.paymentservice.service

import org.springframework.stereotype.Service


class CardNoInstallemtnsStrategyService : CardStrategyService() {

    override fun calculateTax(): String {
        return "Cartão sem parcelas"
    }
}