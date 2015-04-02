package interfejsmenjacnica;

import java.util.GregorianCalendar;

import kursevi.Kursevi;

public interface InterfejsMenjacnica {

	public void dodajKurs (GregorianCalendar datum, double prodajni, double srednji, double kupovni);
	public void obrisiKurs (GregorianCalendar datum);
	public Kursevi pronadjiKurs (GregorianCalendar datum);
	
}
