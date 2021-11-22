
public class TestaBanco {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();

		cliente.nome = "David Carmo";
		cliente.cpf = "222.222.222-22";
		cliente.profissao = "Programador";

		Conta contaDoCliente = new Conta();
		contaDoCliente.deposita(50);

		contaDoCliente.titular = cliente;

		System.out.println(contaDoCliente.titular.nome);
		System.out.println(cliente);
		System.out.println(contaDoCliente.titular);
	}
}
