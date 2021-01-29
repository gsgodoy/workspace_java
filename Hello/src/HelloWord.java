import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		
		System.out.println("Primeiro programa no eclipse...");
		System.out.println("Digite um valor e enter:");
		a = teclado.nextInt();
		System.out.println("voce digitou: "+a);
		
		teclado.close();
	}
}
