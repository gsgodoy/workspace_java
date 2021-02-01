
public class Banco {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		
		c1.numConta = 10011;
		c1.nomeTitular = "Jose Roberto";
		c1.creditar(1000);
		
		System.out.println(c1.exibirInfo());
		
		ContaEspecial c2 = new ContaEspecial();
		c2.numConta = 10012;
		c2.nomeTitular = "Gustavo Godoy";
		c2.creditar(1000);
		c2.limite = 500.00;
		
		System.out.println(c2.exibirInfo());
	}
}
