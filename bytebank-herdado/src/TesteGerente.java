
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();

		g1.setNome("David");
		g1.setCpf("123.123.123-22");
		g1.setSalario(5000.0);
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(123456);
		boolean autentica = g1.autentica(123456);
		System.out.println(autentica);
		System.out.println(g1.getBonificacao());
	}
}
