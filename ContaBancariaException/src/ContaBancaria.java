public class ContaBancaria {
		
	private int numeroConta;
	private int digitoVerif;
	private String cpfTitular;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, int dv, String nome, String cpf) {
		this.numeroConta = numeroConta;
		this.digitoVerif = dv;
		this.nomeTitular = nome;
		this.cpfTitular = cpf;
		this.saldo = 0.0;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVerif() {
		return digitoVerif;
	}

	public void setDigitoVerif(int digitoVerif) {
		this.digitoVerif = digitoVerif;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String exibirDados(){
		return "Cliente "+numeroConta+"-"+digitoVerif+" | "+nomeTitular+" (cpf: "+cpfTitular+") | Saldo: R$"+saldo;
	}
	
	public void creditar(double valor) {
		if (saldo <= 0) {
			throw new ContaException("CR�DITO INV�LIDO !!! - Valor nao pode ser negativo");
		}
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (saldo <= 0) {
			throw new ContaException("D�BITO INV�LIDO !!! - Valor nao pode ser negativo");
		}
			if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		else {
		return false;
		}
	
	}
}
