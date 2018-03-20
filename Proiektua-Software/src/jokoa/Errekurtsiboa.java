package jokoa;

public class Errekurtsiboa extends Karta {
	

	//Atributuak
	private boolean jokatua;
	
	//Eraikitzailea
	public Errekurtsiboa(String pKolorea, int pPuntuak, int pZenbakia, String pDeskribapena) {
		super(pKolorea, pPuntuak, pZenbakia, pDeskribapena);
		this.jokatua = false;
	}
	
	//Metodoak
	public boolean getJokatua() {
		return this.jokatua;
	}
	
	public void setJokatua(boolean pJokatua) {
		this.jokatua = pJokatua;
	}
}
