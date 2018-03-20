package jokoa;

public abstract class Karta {
	//Atributuak
	private String kolorea;
	private int puntuak;
	private int zenbakia;
	private String deskribapena;
	
	//Eraikitzailea
	public Karta(String pKolorea, int pPuntuak, int pZenbakia, String pDeskribapena) {
		this.kolorea = pKolorea;
		this.puntuak = pPuntuak;
		this.zenbakia = pZenbakia;
		this.deskribapena = pDeskribapena;
	}
	
	//Metodoak
	public void kartaJokatu() {
		
	}
}
