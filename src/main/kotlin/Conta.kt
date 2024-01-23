open class Conta(
    val numero: String,
    val nome: String,
    val cpf: String,
    var saldo: Double
) {

   open fun depositar(valorDepositado: Double) {
        this.saldo += valorDepositado
        println("Depósito de $valorDepositado realizado. Novo saldo: $saldo")
    }

   open fun sacar(valorSacado: Double): Boolean {
        if (valorSacado <= this.saldo) {
            this.saldo -= valorSacado
            println("Você retirou o valor de $valorSacado realizado. Novo saldo  : $saldo")
            return true
        } else {
            println("Saldo insuficiente")
            return false
        }
    }

  open  fun mostrarSaldo(): Double {
        return this.saldo
    }

   open fun transferencia(c2: Conta, valorTransferir: Double) {
        if (sacar(valorTransferir)) {
            c2.depositar(valorTransferir)
        }
    }
}