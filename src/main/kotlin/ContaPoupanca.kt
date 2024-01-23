class ContaPoupanca(
    numero: String,
    nome: String,
    cpf: String,
    saldo: Double,
  val rendimento:Double
):Conta(numero,nome,cpf,saldo) {
    fun aplicaTaxaRendimento() {
        saldo += saldo*rendimento
    }
}