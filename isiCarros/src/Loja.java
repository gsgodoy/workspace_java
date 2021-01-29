
public class Loja {
	public static void main(String[] args) {
		
		Carro c1; //declarei uma variável c1 do tipo carro
		Carro c2;
		
		//antes de começar a preencher dados, preciso criar uma área de memória
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca = "xevrolet";
		c1.modelo = "corça";
		c1.cor = "branco com detalhes";
		c1.ano = 1997;
		c1.preco = 6999.00;
		
		c2.marca = "porche";
		c2.modelo = "Kaieni";
		c2.cor = "preto";
		c2.ano = 2021;
		c2.preco = 999999.00;
		
		//exibindo os anuncios
		c1.exibirAnuncio();
		double ipvaC1 = c1.calcularIPVA();
		System.out.println("O IPVA deste carro é R$ "+ipvaC1);
		
		c2.exibirAnuncio();
		double ipvaC2 = c2.calcularIPVA();
		System.out.println("O IPVA deste carro é R$ "+ipvaC2);
		
		System.out.println("---------------");
		System.out.println("O patrao ficou doido, todos os carros com 10% de desconto ");
		System.out.println(c1.marca+" /"+c1.modelo+ " agora por R$"+c1.calcularNovoPrecoComDesconto(10.0));
		
		/*
		*System.out.println("---- Anuncio do isiCarros");
		*System.out.println("Carro: "+c1.marca+" "+c1.modelo+" /"+c1.ano);
		*System.out.println("Cor: "+c1.cor);
		*System.out.println("preço R$ "+c1.preco);
		*/
	}
}
