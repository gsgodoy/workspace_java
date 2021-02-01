
public class BombaCombustivel {
	
	private String nomeCombustivel;
	private double precoLitro;
	private double qtdeLitros;
	private double valorPagar;
	
	public BombaCombustivel(String nomeCombustivel, double precoLitro) {
		super();
		this.nomeCombustivel = nomeCombustivel;
		this.precoLitro = precoLitro;
	}
	public String getNomeCombustivel() {
		return nomeCombustivel;
	}
	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdeLitros() {
		return qtdeLitros;
	}
	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}
	public double getValorPagar() {
		return valorPagar;
	}
	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}
	public void abastecerPorLitros(double qtde) {
		this.qtdeLitros = qtde; //eu quero armazenar a qtde para reutiliza-la
		this.valorPagar = qtdeLitros * precoLitro;
	}
	public void abastecerPorValor(double total) {
		this.valorPagar= total;
		qtdeLitros = valorPagar / precoLitro;
	}
	public String exibirRecibo() {
		String recibo =   "================================\n"
						+ "============ PostoX ============\n"
						+ "================================\n"
						+ "Combustivel : "+nomeCombustivel+ "\n"
						+ "Preco Litro : R$ "+String.format("%.3f", precoLitro) + "\n"
						+ "Litros : "+String.format("%.3f", qtdeLitros) + "\n"
						+ "VALOR TOTAL : R$ "+String.format("%.2f", valorPagar) + "\n"
						+ "--------------------------------";
		return recibo;
	}
}
