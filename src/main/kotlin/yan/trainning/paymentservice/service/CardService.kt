package yan.trainning.paymentservice.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import yan.trainning.paymentservice.model.PaymentMethod
import yan.trainning.paymentservice.patterns.strategy.TaxStrategy

@Service
class CardService : IPaymentService {

    val taxStrategy =  TaxStrategy()

    override fun paymentProcess(paymentMethod: PaymentMethod): String {
    taxStrategy.setStrategy(paymentMethod)
        return "Card Processed tex =" + taxStrategy.calculateTax()
    }

}
