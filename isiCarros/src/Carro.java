/*Neste caso, a classe CARRO não tera método Main
 * ela sera apenas uma estrutura que contém váriaveis (atributos)
 * para armazenar todas as infos de um carro
 * 
 * com isso, estamos criando um novo tipo de dados
 */


public class Carro {
	//aqui basta criar várias variáveis (atributos)
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;

	void exibirAnuncio(){
		System.out.println("---- Anuncio do isiCarros");
		System.out.println("Carro: "+marca+" "+modelo+" /"+ano);
		System.out.println("Cor: "+cor);
		System.out.println("Preço R$ "+preco);
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
