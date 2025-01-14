
public class Student {

	private String ime;
	private String prezime;
	private double prosek;
	
	public Student(String ime, String prezime, double prosek) {
		this.ime = ime;
		this.prezime = prezime;
		this.prosek = prosek;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public double getProsek() {
		return prosek;
	}
	
	public String toString() {
		return "Ime:" + ime + "\nPrezime:" + prezime + "\nProsek:" + prosek + "\n------";
	}
	
}
