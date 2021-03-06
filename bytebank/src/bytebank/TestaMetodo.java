package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);

		boolean conseguiuRetirar = conta.saca(20);

		System.out.println(conseguiuRetirar);
		System.out.println(conta.saldo);

		Conta outraConta = new Conta();

		outraConta.deposita(1000);

		if (outraConta.transfere(300, conta)) {
			System.out.println("TransferĂȘncia feita com sucesso");
		} else {
			System.out.println("Erro ao transferir");
		}

		System.out.println(outraConta.saldo);
		System.out.println(conta.saldo);
		
		conta.titular = "David Carmo";
		System.out.println(conta.titular);
	}
}
