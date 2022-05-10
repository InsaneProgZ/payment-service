package yan.trainning.paymentservice.model.client

import org.springframework.stereotype.Component

data class NotificationServiceRequest (val customerId: String, val status: Status)