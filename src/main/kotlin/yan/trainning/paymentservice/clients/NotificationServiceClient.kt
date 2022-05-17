package yan.trainning.paymentservice.clients

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.postForEntity
import yan.trainning.paymentservice.model.client.NotificationServiceRequest
import yan.trainning.paymentservice.model.client.Status
import java.net.URI


class NotificationServiceClient {


    private var restTemplate: RestTemplate = RestTemplate()

    fun createNotification() {
        restTemplate.postForEntity<ResponseEntity<Void>>(
            URI("http://127.0.0.1:8084/notification"),
            NotificationServiceRequest("vendedor1", Status.PAID)
        )
    }
}