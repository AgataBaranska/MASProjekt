
public class Osoba {
private String imie;
private String nazwisko;
private String pesel;
private String telefon;
private String email;
private Adres adres;
public Osoba(String imie, String nazwisko, String pesel, String telefon, String email, String ulica, String miasto, String kodPocztowy,String kraj) {
	super();
	this.imie = imie;
	this.nazwisko = nazwisko;
	this.pesel = pesel;
	this.telefon = telefon;
	this.email = email;
	this.adres = new Adres(ulica,miasto,kodPocztowy,kraj);
}
public String getImie() {
	return imie;
}
public String getNazwisko() {
	return nazwisko;
}
public String getPesel() {
	return pesel;
}
public String getTelefon() {
	return telefon;
}
public String getEmail() {
	return email;
}
public Adres getAdres() {
	return adres;
}





	
}
