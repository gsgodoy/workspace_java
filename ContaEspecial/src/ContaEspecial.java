
public class ContaEspecial extends ContaCorrente {
	double limite;
	
	
	boolean debitar(double valor) {
		if (saldo+limite >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	String exibirInfo() {
		return numConta + " - " + nomeTitular + " R$ "+saldo+" | Conta Especial - Limite R$"+limite;
	}
	
}
