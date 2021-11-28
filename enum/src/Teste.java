
public class Teste {
	public static void main(String[] args) {
		Thread t = new Thread(() -> System.out.println("rodando..."));
		
		t.setPriority(Thread.MAX_PRIORITY);
		
		t.start();
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		
		System.out.println(pMin.name());
		System.out.println(pMax.name());
		
		System.out.println(pMin.ordinal());
		
	}
}
