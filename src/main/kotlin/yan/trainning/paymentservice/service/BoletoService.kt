package yan.trainning.paymentservice.service

import org.springframework.stereotype.Service
import yan.trainning.paymentservice.model.PaymentMethod
import yan.trainning.paymentservice.patterns.strategy.TaxStrategy

@Service
class BoletoService : IPaymentService {

    val taxStrategy =  TaxStrategy()
    override fun paymentProcess(paymentMethod: PaymentMethod): String {
        taxStrategy.setStrategy(paymentMethod)
        return "Boleto Processed -> tax=" + taxStrategy.calculateTax()
    }

}