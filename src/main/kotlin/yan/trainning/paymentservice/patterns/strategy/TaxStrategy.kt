package yan.trainning.paymentservice.patterns.strategy

import yan.trainning.paymentservice.model.Boleto
import yan.trainning.paymentservice.model.Card
import yan.trainning.paymentservice.model.PaymentMethod
import yan.trainning.paymentservice.service.tax.BoletoTax
import yan.trainning.paymentservice.service.tax.CardInstallmentsTax
import yan.trainning.paymentservice.service.tax.CardNoInstallemtnsTax
import yan.trainning.paymentservice.service.tax.ITaxService


class TaxStrategy : ITaxService {

    private lateinit var iTaxService: ITaxService

    fun setStrategy(paymentMethod: PaymentMethod) {
        return when(paymentMethod){
            is Boleto -> iTaxService = BoletoTax()
            is Card -> iTaxService = if ((paymentMethod.installments ?: 0) > 1) CardInstallmentsTax() else CardNoInstallemtnsTax()
            else -> {}
        }
    }

    override fun calculateTax(): String {
       return iTaxService.calculateTax()
   }


}
