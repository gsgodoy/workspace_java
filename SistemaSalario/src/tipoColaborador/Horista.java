package tipoColaborador;

public class Horista extends Funcionario {
	private float valorHora;
	private int numHoras;
	
	public Horista(String nome, int numRegistro, float valorHora, int numHoras) {
		super(nome, numRegistro);
		this.valorHora = valorHora;
		this.numHoras = numHoras;
	}
	
	@Override
	public float calcularSalario() {
		return valorHora * numHoras;
	}
	
}
