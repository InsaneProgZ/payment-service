package yan.trainning.paymentservice.service.tax


class BoletoTax : ITaxService {

     override fun calculateTax(): String {
        return "Boleto não tem parcela"
    }
}