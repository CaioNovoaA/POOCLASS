class ContaCorrente(
    numero: String,
    nome: String,
    cpf: String,
    saldo: Double,
   val titular: Funcionario ? =null,
    val taxaManut: Double
) : Conta(numero, nome, cpf, saldo) {
    fun aplicaTaxa() {
        saldo -= taxaManut
    }
    override fun sacar(valorSacado: Double): Boolean {
        aplicaTaxa()
        return super.sacar(valorSacado)
    }
}
