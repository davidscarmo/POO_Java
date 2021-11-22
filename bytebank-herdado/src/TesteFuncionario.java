
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario funcionarioDavid = new Gerente();
		
		funcionarioDavid.setNome("David Carmo");
		funcionarioDavid.setCpf("123.123.132-22");
		funcionarioDavid.setSalario(1270);
		
		System.out.println(funcionarioDavid.getNome());
		System.out.println(funcionarioDavid.getBonificacao());
	}
}
