package menjacnice;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valute.Valute;
import kursevi.Kursevi;
import interfejsmenjacnica.InterfejsMenjacnica;

//morao sam da stavim ovu klasu kao abstract, jer sam zaboravio na pocetku da kao argument stavim objekat "valute"
//klase Valute, pa nije hteo program da mi prihvati merge

 public abstract class Menjacnica implements InterfejsMenjacnica{

	private LinkedList<Valute> valute;
	
	public void dodajKurs(Valute valuta, GregorianCalendar datum,
			double prodajni, double srednji, double kupovni) {
		
		Kursevi kurs = new Kursevi();
		
		kurs.setDatum(datum);
		kurs.setKupovni(kupovni);
		kurs.setProdajni(prodajni);
		kurs.setSrednji(srednji);
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i) != null) {
				Valute v = valute.get(i);
				if(v.getNaziv().equals(valuta)) {
					v.getKursevi().add(kurs);
					break;
				}
			}
		}
		
	}

	public void obrisiKurs(Valute valuta, GregorianCalendar datum) {
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i) != null) {
				Valute v = valute.get(i);
				if(v.getNaziv().equals(valuta)) {
					for (int j = 0; j < v.getKursevi().size(); j++) {
						if(v.getKursevi().get(j) != null) {
							Kursevi k = v.getKursevi().get(j);
							if(k.getDatum().equals(datum)) {
								v.getKursevi().remove(j);
							}
						}
					}
				}
			}
		}
		
	}

	public Kursevi pronadjiKurs(Valute valuta, GregorianCalendar datum) {
	
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i) != null) {
				Valute v = valute.get(i);
				if(v.getNaziv().equals(valuta)) {
					for (int j = 0; j < v.getKursevi().size(); j++) {
						if(v.getKursevi().get(j) != null) {
							Kursevi k = v.getKursevi().get(j);
							if(k.getDatum().equals(datum)){
								return k;
							}
						}
					}
				}
			}
		}
		return null;
	}
	

	
	
}
