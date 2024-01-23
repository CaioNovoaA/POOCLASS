fun main(args: Array<String>) {

    var caio = Funcionario("Caio", "23424234",5000.00, 0.50)


    val contaCorrente = ContaCorrente(
        "123456",
        "Guilherme",
        "456567",
        00.00,
        caio,
        0.10,


    )
    val contaPoupanca = ContaPoupanca(
        "123458",
        "Guilherme",
        "456567",
        8000.00,
        0.50
    )

    val folhaDePagamento = FolhaDePagamento()

    folhaDePagamento.pagarSalario(caio, contaCorrente)

    println("Conta Corrente Saldo ${contaCorrente.mostrarSaldo()}")




}