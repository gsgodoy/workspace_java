package userinterface;

import core.CartaoCashBack;
import core.CartaoPrePago;

public class Evento {
	public static void main(String[] args) {
		
		CartaoPrePago cartoes[];
		
		cartoes = new CartaoPrePago[4];
		
		cartoes[0] = new CartaoPrePago("1111 1111", "Cliente 1", 2020, 10, 0.0);
		cartoes[1] = new CartaoCashBack("1111 2222", "Cliente 2", 2020, 10, 0.0, 2);
		cartoes[2] = new CartaoCashBack("1111 3333", "Cliente 3", 2020, 10, 0.0, 1);
		cartoes[3] = new CartaoCashBack("1111 4444", "Cliente 4", 2020, 10, 0.0, 0);
		
		for (int pos=0; pos<4; pos++) {
			cartoes[pos].adicionarCredito(1000.00);
			System.out.println(cartoes[pos]);
			
			cartoes[pos].comprar(100.00);
			System.out.println(cartoes[pos]);
		}
		
		/*
		CartaoCashBack cb1, cb2, cb3;
		
		cpp = new CartaoPrePago("1111 2222 3333 4444", "Gustavo Godoy", 23, 10, 0);
		cb1 = new CartaoCashBack("1111 2222 3333 4444", "Gustavo Souza", 23, 10, 0, 0);
		cb2 = new CartaoCashBack("1111 2222 3333 4444", "Gustavo Souza", 23, 10, 0, 1);
		cb3 = new CartaoCashBack("1111 2222 3333 4444", "Gustavo Souza", 23, 10, 0, 2);
		
		
		System.out.println(cpp);
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
		
		cpp.adicionarCredito(1000);
		cb1.adicionarCredito(1000);
		cb2.adicionarCredito(1000);
		cb3.adicionarCredito(1000);
		
		System.out.println("\n\n ---> Adicionano R$ 1000,00 de crédito");
		System.out.println(cpp);
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
		
		cpp.comprar(100);
		cb1.comprar(100);
		cb2.comprar(100);
		cb3.comprar(100);
		
		System.out.println("\n\n ---> Comprando R$ 100,00");
		System.out.println(cpp);
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
		*/
		
	}
}
