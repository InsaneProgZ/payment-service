package yan.trainning.paymentservice.controller

import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import yan.trainning.paymentservice.patterns.factory.FactoryMethodPaymentService
import yan.trainning.paymentservice.model.Boleto
import yan.trainning.paymentservice.model.Payment
import yan.trainning.paymentservice.model.PaymentMethod
import yan.trainning.paymentservice.patterns.strategy.StrategyCardInstallments
import yan.trainning.paymentservice.service.CardNoInstallemtnsStrategyService
import yan.trainning.paymentservice.service.CardStrategyService
import yan.trainning.paymentservice.service.PaymentService
import java.awt.SystemColor.text

@RestController
@RequestMapping("/payment")
class MainController ( val factory: FactoryMethodPaymentService){

    @Autowired
    lateinit var paymentService: PaymentService


    @PostMapping("/noFactory")
    fun checkPayment (@RequestBody payment: Payment): String {
        return paymentService.paymentProcess(payment.paymentMethod)
    }

    @PostMapping
    fun checkPaymentUsingFactory (@RequestBody payment: Payment): String {
        val paymentFactory = factory.factory(payment.paymentMethod)
        var text = paymentFactory.paymentProcess(payment.paymentMethod) + " " + paymentFactory.calculateTax()
        if (paymentFactory is StrategyCardInstallments){
             paymentFactory.setStrategy(CardNoInstallemtnsStrategyService())
            text += paymentFactory.calculateTax()
        }
        return text
    }

}