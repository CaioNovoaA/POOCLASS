open class FolhaDePagamento {

    fun pagarSalario(funcionario: Funcionario, conta: Conta) {
        val salario = when (funcionario) {
            is Gerente -> funcionario.calcularSalario()
            // Adicione outros tipos de funcionários conforme necessário
            else -> funcionario.calcularSalarioDefault()
        }
        conta.depositar(salario)
        println("Salário pago para ${funcionario.nome}: $salario")
    }
}