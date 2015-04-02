package valute;

import java.util.LinkedList;

import kursevi.Kursevi;

public class Valute {

	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kursevi> kursevi;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public LinkedList<Kursevi> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kursevi> kursevi) {
		this.kursevi = kursevi;
	}
	
	
	
}
