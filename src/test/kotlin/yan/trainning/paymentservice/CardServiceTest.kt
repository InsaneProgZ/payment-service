package yan.trainning.paymentservice

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import yan.trainning.paymentservice.model.Card

@SpringBootTest
class CardServiceTest {

	@Test
	fun processPayment(card: Card) {
		card.number.toString().toRegex().matches("REGEX DE CARTAO")
		validarFraude(card)
	}

	private fun validarFraude(card: Card) {
		TODO("Not yet implemented")
	}

}
