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
	@Override
	public String toString() {
		
		String kurs = "";
		
		for (int i = 0; i < kursevi.size(); i++) {
			
			if(kursevi.get(i) != null) {
				kurs += kursevi.get(i) + "\n";
			}
		}
		
		return "Valute [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv
				+ "]\n" +kurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Valute) {
			Valute v = (Valute) obj;
			return v.getNaziv().equals(naziv);
		}
		return false;
	}
	
	
	
}
