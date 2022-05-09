package yan.trainning.paymentservice.service

import yan.trainning.paymentservice.model.PaymentMethod

interface IPaymentService {
     fun paymentProcess(paymentMethod: PaymentMethod): String
}