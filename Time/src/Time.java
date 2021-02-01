
public class Time {

	private int hora;
	private int minuto;
	private int segundo;
	
	public void setTime(int h, int m, int s) {
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	
	public void setTime(int h, int m) {
		this.hora = h;
		this.minuto = m;
		this.segundo = 0;
	}
	
	public String exibirHoraUniversal() {
		return hora+":"+minuto+":"+segundo;
	}
	
	public String exibirHoraPadrao() {
		String hPadrao;
		String sufixo;
		
		if (hora == 0) {
			hPadrao = "12:";
			sufixo = "AM";
		}
		else if (hora == 12) {
			hPadrao = "12:";
			sufixo = "PM";
		}
		else if (hora > 0 && hora < 12) {
			hPadrao = hora+":";
			sufixo = "AM";
		}
		else {
			hPadrao = (hora-12)+":";
			sufixo = "PM";
		}
		return hPadrao+minuto+":"+segundo+sufixo;
	}
}
