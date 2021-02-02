
public class Banco {
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente(10011,"Jose Roberto",1000);
		/*
		c1.setNumConta(10011);
		c1.setNomeTitular("Jose Roberto");
		c1.creditar(1000);
		*/	
		System.out.println(c1.exibirInfo());
		
		ContaEspecial c2 = new ContaEspecial(10012,"Gustavo Godoy",2000,500.00);
		/*
		c2.setNumConta(10012);
		c2.setNomeTitular("Gustavo Godoy");
		c2.creditar(2000);
		c2.setLimite(500.00);
		*/
		System.out.println(c2.exibirInfo());
		
		if (c1.debitar(1300)) {
			System.out.println("Debito efetuado na conta c1");
		}
		else {
			System.out.println("Debito não autoriazado na conta c1");
		}
		if (c2.debitar(2300)) {
			System.out.println("Debito efetuado na conta c2");
		}
		else {
			System.out.println("Debito não autoriazado na conta c2");
		}
	
		System.out.println(c1.exibirInfo());
		System.out.println(c2.exibirInfo());
	
	}	
}
