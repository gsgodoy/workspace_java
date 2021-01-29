
public class Empregado {
	
	String nome;
	String cargo;
	double salario;
	
	void exibirDados(){
		System.out.println("---- Dados do Empregado ----");
		System.out.println("Funcionario: "+nome+ " ("+cargo+") R$ "+salario);
	}
	
	void aumentarSalario(double percentual) {
		double novoSalario = salario + salario * percentual / 100;
		salario = novoSalario;
	}
}
