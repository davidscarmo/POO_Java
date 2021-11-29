public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao{
		System.out.println("ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
//		Conta c = new Conta();
//		throw new ArithmeticException("Deu errado");
		// System.out.println("Fim do metodo2");
		throw new MinhaExcecao("Deu muito errado!");
	}
}