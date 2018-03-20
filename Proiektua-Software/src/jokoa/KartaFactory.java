package jokoa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class KartaFactory {
	//Atributuak
	private static KartaFactory nFactory;
	
	//Eraikitzailea
	public KartaFactory(String pKolore) {
		/*Collection<Karta> lista;
		try {
			Scanner sc = new Scanner(new FileReader("F:\\Software Ingenieritza\\Proiektua\\kartak"));
			String egungoa = null;
			String[] zatika = null;
			while (sc.hasNext()) {
				egungoa = sc.nextLine();
				zatika = egungoa.split("	");				
				
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
				if (zatika[0].equals("Lehoia")) {
					Lehoia karta = new Lehoia(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
				if (zatika[0].equals("Hipopotamoa")) {
					Hipopotamoa karta = new Hipopotamoa(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
				if (zatika[0].equals("Krokodiloa")) {
					Krokodiloa karta = new Krokodiloa(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
				if (zatika[0].equals("Sugea")) {
					Sugea karta = new Sugea(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
				if (zatika[0].equals("Girafa")) {
					Girafa karta = new Girafa(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
				if (zatika[0].equals("Zebra")) {
					Zebra karta = new Zebra(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
				if (zatika[0].equals("Foka")) {
					Foka karta = new Foka(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
				if (zatika[0].equals("Kamaleon")) {
					Kamaleon karta = new Kamaleon(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
				if (zatika[0].equals("Tximinoa")) {
					Tximinoa karta = new Tximinoa(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
				if (zatika[0].equals("Kanguroa")) {
					Kanguroa karta = new Kanguroa(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
				if (zatika[0].equals("Loro")) {
					Loro karta = new Loro(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
				if (zatika[0].equals("Mofeta")) {
					Mofeta karta = new Mofeta(pKolore,Integer.parseInt(zatika[1]),Integer.parseInt(zatika[2]),zatika[3]);
				}
				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error 404: File not found :(");
		}*/
	}
	
	//Metodoak
	public Karta createKarta(String pMota) {
		return null;
	}
}
