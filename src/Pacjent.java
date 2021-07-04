
public class Pacjent extends Osoba {
private Osoba osoba;
private String idNumer;
private FormularzRodo formularzRodo;

public Pacjent(String imie, String nazwisko, String pesel, String telefon, String email, String ulica, String miasto,
		String kodPocztowy, String kraj) {
	super(imie, nazwisko, pesel, telefon, email, ulica, miasto, kodPocztowy, kraj);
	// TODO Auto-generated constructor stub
}
public Pacjent(Osoba osoba, String idNumer, FormularzRodo formularzRodo) {
	
	this.idNumer = idNumer;
	this.formularzRodo = formularzRodo;
	this.osoba= osoba;
}



}
