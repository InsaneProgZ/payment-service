package yan.trainning.paymentservice.service.tax


class CardInstallmentsTax : ITaxService {

     override fun calculateTax(): String {
        return "Cartão com parcelas"
    }

}