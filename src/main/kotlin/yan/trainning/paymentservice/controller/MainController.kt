package yan.trainning.paymentservice.controller

import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import yan.trainning.paymentservice.model.Boleto
import yan.trainning.paymentservice.model.Payment
import yan.trainning.paymentservice.model.PaymentMethod
import yan.trainning.paymentservice.service.PaymentService

@RestController
@RequestMapping("/payment")
class MainController ( val bean: BeanFactory){

    @Autowired
    lateinit var paymentService: PaymentService

    @PostMapping
    fun checkPayment (@RequestBody payment: Payment): String {
        return paymentService.paymentProcess(payment.paymentMethod)
    }

}