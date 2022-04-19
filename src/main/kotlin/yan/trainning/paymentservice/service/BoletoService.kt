package yan.trainning.paymentservice.service

import org.springframework.stereotype.Service
import yan.trainning.paymentservice.model.PaymentMethod

@Service
class BoletoService : IPaymentService{
    override fun paymentProcess(paymentMethod: PaymentMethod): String {
        return "Boleto Processed"
    }

    override fun calculateTax(): String {
        return "texa de boleto zerada uhul"
    }

}