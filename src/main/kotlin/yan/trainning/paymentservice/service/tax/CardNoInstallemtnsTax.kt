package yan.trainning.paymentservice.service.tax


class CardNoInstallemtnsTax : ITaxService {

     override fun calculateTax(): String {
        return "Cartão sem parcelas"
    }
}