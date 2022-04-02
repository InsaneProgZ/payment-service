package yan.trainning.paymentservice.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import yan.trainning.paymentservice.model.Payment

@RestController
@RequestMapping("/payment")
class MainController {

    @PostMapping
    fun checkPayment (@RequestBody payment: Payment) = payment
}