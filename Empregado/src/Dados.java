
public class Dados {
	public static void main(String[] args) {
		
		Empregado func1, func2;
		
		func1 = new Empregado();
		func2 = new Empregado();
		
		func1.nome = "Gustavo Godoy";
		func1.cargo = "Engenheiro";
		func1.salario = 1000.00;
		
		func2.nome = "Day Nascimento";
		func2.cargo = "Engenheiro";
		func2.salario = 5500.00;
		
		func1.exibirDados();
		func2.exibirDados();
		
		func1.aumentarSalario(10);
		func2.aumentarSalario(8);
		
		func1.exibirDados();
		func2.exibirDados();
		
	}
}
