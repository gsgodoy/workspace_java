
public class ContaCorrente {
	int numConta;
	String nomeTitular;
	double saldo;
	
	void creditar(double valor) {
		saldo += valor;
	}
		
	boolean debitar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	String exibirInfo() {
		return numConta + " - " + nomeTitular + " R$ "+saldo;
	}
	
	
}
