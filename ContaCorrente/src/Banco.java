import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaBancaria cliente1 = new ContaBancaria(1111,1,"Gustavo Godoy","111.111.111-11");
		
		System.out.println(cliente1.exibirDados());
		
		int opcao;
		double valor;
		
		cliente1.setSaldo(0.00);
		
		do {
			System.out.println("Banco X");
			System.out.println("Digite 1-Deposito / 2-Saque / 3-Info / 0-Encerrar");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Digite o valor do deposito:");
				valor = teclado.nextDouble();
				cliente1.creditar(valor);
				break;
			case 2:
				System.out.println("Digite o valor do saque:");
				valor = teclado.nextDouble();
				if (cliente1.debitar(valor)) {
					System.out.println("Saque Autorizado");
				}
				else {
					System.out.println("Saque não autorizado");
				}
				break;
			case 3:
				System.out.println(cliente1.exibirDados());
				break;
			case 0:
				System.out.println("Obrigado!");
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
				}
		}
		while (opcao !=0 );
	
		teclado.close();
	}
}
