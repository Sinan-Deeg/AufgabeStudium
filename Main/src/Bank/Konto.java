package informatik.bank.domain;

public class Konto {
	private static int kontoz�hler = 0;
	
	private int nummer;
	private long stand = 0;
	private String inhaber;

	public Konto(String inhaber) {
		nummer = 1000 + kontoz�hler++;
		this.inhaber = inhaber;
	}
	
	public int getKontonummer() {
		return nummer;
	}

	@Override
	public String toString() {
		return "Konto [nummer=" + nummer + ", inhaber=" + inhaber + "]";
	}
	
}
