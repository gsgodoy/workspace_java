
public class TimeTeste {
	public static void main(String[] args) {
		
		Time t = new Time();
		
		t.setTime(0, 30, 20);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(12, 30, 00);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(3, 30, 20);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		t.setTime(23, 30, 20);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
	}
}
