import bangunDatar.Persegi;
import bangunDatar.Segitiga;

public class App {
  // Main method dari App
  public static void main(String[] args) {
    System.out.println("Belajar JAVA");

    // instance object persegi
    Persegi persegi = new Persegi();
    persegi.sisiPersegi = 10;
    persegi.cetakSisi();
    System.out.println(persegi.getSisi());
    persegi.cetakKeliling();
    persegi.cetakLuas();
    // ini tidak bisa krn bermodifer default
    // SecondPersegi secondPersegi = new SecondPersegi();

    // Instance object segitiga
    Segitiga segitiga = new Segitiga();
    segitiga.cetakSegitiga(5);
    segitiga.setAlas(10);
    segitiga.setTinggi(5);
    segitiga.setSisiMiring(10);

    System.out.println("alas: " + segitiga.getAlas());
    System.out.println("tinggi: " + segitiga.getTinggi());
    System.out.println("sisi miring: " + segitiga.getSisiMiring());

    System.out.println("keliling: " + segitiga.getKeliling());
    System.out.println("luas: " + segitiga.getLuas());

  }
}