import java.util.Scanner;


public class Posto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*vers�o 3.0 - criar v�rias bombas com v�rias var�aveis, utilizando vetores
		 
		*/
		int opcao;
		int numCombustivel;
		double valor;
		
		BombaCombustivel lista[];
		
		lista = new BombaCombustivel[4];
		
		lista[0] = new BombaCombustivel("Etanol", 2.899);
		lista[1] = new BombaCombustivel("Gasolina Comum", 3.999);
		lista[2] = new BombaCombustivel("Gasolina Aditivada", 4.255);
		lista[3] = new BombaCombustivel("Diesel", 3.555);
		
		do {
			System.out.println("Selecione seu comust�vel 0-3");
			numCombustivel = teclado.nextInt();
			if (numCombustivel >= 0 && numCombustivel <= 3) {
				System.out.println("Combustivel selecionado = "+
									lista[numCombustivel].getNomeCombustivel() +
									" Pre�o Litro R$ " +
									lista[numCombustivel].getPrecoLitro());
				System.out.println("Digite 1 - Abastecer por Litros / 2 - Abastecer por Valor");
				opcao = teclado.nextInt();
				if (opcao ==1) {
					System.out.println("Selecionou abastecer por litros");
					System.out.println("Qtos litros? ");
					valor = teclado.nextDouble();
					lista[numCombustivel].abastecerPorLitros(valor);
					System.out.println(lista[numCombustivel].exibirRecibo());
				}
				else if (opcao ==2) {
					System.out.println("Selecionou abastecer por valor");
					System.out.println("Qual valor? ");
					valor = teclado.nextDouble();
					lista[numCombustivel].abastecerPorValor(valor);
					System.out.println(lista[numCombustivel].exibirRecibo());
			}
				else {
					System.out.println("Op��o Inv�lida!");
				}
			}
			else if (numCombustivel > 3 || numCombustivel < -1) {
				System.out.println("Combustivel Inv�lido!");
			}
			
		} while (numCombustivel != -1);
		
		
		
		/* vers�o 2.0 - com interface gr�fica
		BombaCombustivel b1 = new BombaCombustivel("Gasolina", 3.50);
		
		b1.abastecerPorLitros(80);
		JOptionPane.showMessageDialog(null, b1.exibirRecibo());
		
		b1.abastecerPorValor(30.00);
		JOptionPane.showMessageDialog(null, b1.exibirRecibo(),
									"RECIBO", JOptionPane.PLAIN_MESSAGE);
		*/
		
		/* vers�o 1.0 - via terminal
		b1.abastecerPorLitros(80);
		System.out.println(b1.exibirRecibo());
		
		b1.abastecerPorValor(30);
		System.out.println(b1.exibirRecibo());
		*/
	teclado.close();
	}
	
}
