package Salario;

import tipoColaborador.Chefe;
import tipoColaborador.Comissionado;
import tipoColaborador.Empreitero;
import tipoColaborador.Funcionario;
import tipoColaborador.Horista;

public class TesteSalario {
	public static void main(String[] args) {
		
		Funcionario lista[];
		
		lista = new Funcionario[5];
		
		lista[0] = new Chefe("Jose",1234, 8500.00f, 10f, 650.00f);
		lista[1] = new Comissionado("Jose",1235, 8500.00f, 20f);
		lista[2] = new Comissionado("Jose",1236, 8500.00f, 25f);
		lista[3] = new Horista("Jose",1237, 78.50f, 120);
		lista[4] = new Empreitero("Jose",1238, 8500.00f);
		
		for (Funcionario f : lista) {
			System.out.println(f.getNumRegistro()+" - "+f.getNome()+ " R$ "+f.calcularSalario());
		}
		
	}
}
