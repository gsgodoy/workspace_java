package core;

public class CartaoCashBack extends CartaoPrePago {
	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	public boolean comprar(double valor) {
		if (super.saldo>= valor) {
			super.saldo -= valor;
			if (tipo == 0) {
				super.saldo += valor * 0.08;
			}
			else if (tipo == 1) {
				super.saldo += valor * 0.05;
			}
			else if (tipo == 2) {
				super.saldo += valor * 0.02;
			}
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "CartaoCashBack [numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular
				+ ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
		
}
