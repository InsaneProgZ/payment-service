package yan.trainning.paymentservice.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import yan.trainning.paymentservice.clients.NotificationServiceClient
import yan.trainning.paymentservice.model.PaymentMethod
import yan.trainning.paymentservice.patterns.strategy.TaxStrategy


class CardService : IPaymentService {

    val taxStrategy =  TaxStrategy()

    private val notificationServiceClient= NotificationServiceClient()

    override fun paymentProcess(paymentMethod: PaymentMethod): String {
    taxStrategy.setStrategy(paymentMethod)
        notificationServiceClient.createNotification()
        return "Card Processed tex =" + taxStrategy.calculateTax()
    }

}
