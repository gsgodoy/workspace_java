package tipoColaborador;

public class Empreitero extends Funcionario {
	private float valorEmpreita;

	public Empreitero(String nome, int numRegistro, float valorEmpreita) {
		super(nome, numRegistro);
		this.valorEmpreita = valorEmpreita;
	}
	
	@Override
	public float calcularSalario() {
		return valorEmpreita;
	}
}
