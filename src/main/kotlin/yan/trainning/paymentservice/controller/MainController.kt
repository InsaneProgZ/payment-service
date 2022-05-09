package yan.trainning.paymentservice.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import yan.trainning.paymentservice.model.Payment
import yan.trainning.paymentservice.patterns.factory.FactoryMethodPaymentService
import yan.trainning.paymentservice.service.IPaymentService
import yan.trainning.paymentservice.service.PaymentService

@RestController
@RequestMapping("/payment")
class MainController(val factory: FactoryMethodPaymentService) {

    @Autowired
    lateinit var paymentService: PaymentService


    @PostMapping("/noFactory")
    fun checkPayment(@RequestBody payment: Payment): String {
        return paymentService.paymentProcess(payment.paymentMethod)
    }

    @PostMapping
    fun checkPaymentUsingFactory(@RequestBody payment: Payment): String {
       return factory.factory(payment.paymentMethod).paymentProcess(payment.paymentMethod)
    }

}