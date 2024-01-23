class Gerente(
    nome: String,
    cpf: String,
    override var salarioBase: Double,
    taxaDesconto: Double
) : Funcionario(nome, cpf, salarioBase, taxaDesconto) {

    override fun calcularSalario(): Double {
        val desconto = salarioBase * taxaDesconto
        return salarioBase - desconto
    }
}