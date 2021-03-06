
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 5222);
		conta.setNumero(1234);

		System.out.println(conta.getNumero());
		Cliente cliente = new Cliente();
		cliente.setNome("David Carmo");
		conta.setTitular(cliente);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("Programador");
		// it's the same as above but now in two lines
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(conta.getTitular());
		System.out.println(cliente);
	}
}
