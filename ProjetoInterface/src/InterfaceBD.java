
public interface InterfaceBD {
	public void conectar(String banco, String user, String senha);
	public void executar(String comando);
	public void desconectar(String banco);
}
