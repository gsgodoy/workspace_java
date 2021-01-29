/*Neste caso, a classe CARRO n�o tera m�todo Main
 * ela sera apenas uma estrutura que cont�m v�riaveis (atributos)
 * para armazenar todas as infos de um carro
 * 
 * com isso, estamos criando um novo tipo de dados
 */


public class Carro {
	//aqui basta criar v�rias vari�veis (atributos)
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;

	void exibirAnuncio(){
		System.out.println("---- Anuncio do isiCarros");
		System.out.println("Carro: "+marca+" "+modelo+" /"+ano);
		System.out.println("Cor: "+cor);
		System.out.println("Pre�o R$ "+preco);
	}
	
	double calcularIPVA() {
		double valorIPVA;
		if (ano < 2000) {
			valorIPVA = 0.0;
		}
		else {
			valorIPVA = preco * 0.04;
		}
		return valorIPVA;
	}
	
	double calcularNovoPrecoComDesconto(double desconto) {
		double novoPreco = preco - preco * desconto / 100;
		return novoPreco;
	}
	
}
