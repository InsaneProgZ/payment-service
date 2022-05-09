package yan.trainning.paymentservice.service.tax

import yan.trainning.paymentservice.model.PaymentMethod

interface ITaxService {
     fun calculateTax () : String
}