open class Funcionario(
    val nome: String,
    val cpf: String,
    open var salarioBase: Double,
    val taxaDesconto:Double
) {
    open fun calcularSalario(): Double {
        return salarioBase -+ taxaDesconto
    }
    open fun calcularSalarioDefault(): Double {
     val resultado =   salarioBase * 0.1

        return salarioBase - resultado
    }
}