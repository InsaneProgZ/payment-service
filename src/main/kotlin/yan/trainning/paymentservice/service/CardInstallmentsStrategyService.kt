package yan.trainning.paymentservice.service

import org.springframework.stereotype.Service


class CardInstallmentsStrategyService : CardStrategyService() {

    override fun calculateTax(): String {
        return "Cartão com parcelas"
    }

}