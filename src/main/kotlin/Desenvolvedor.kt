class Desenvolvedor(
    nome: String,
    cpf: String,
    override var salarioBase: Double,
    taxaDesconto:Double
) : Funcionario(nome, cpf, salarioBase, taxaDesconto) {
}