package bangunDatar;

public class Segitiga {
  /* Modifier */
  /*
   * 1. public: semua atribut, class, method, bisa dipanggil
   * 2. default: hanya bisa dipanggil dalam class dan package yang sama
   * 3. private: hanya bisa diakses di class yang sama
   * 4. protected: bisa dipanggil dalam class, package, dan subclass yg sama
   */

  // SecondPersegi secondPersegi = new SecondPersegi();

  // Atribut segitiga
  private int alas, tinggi, sisiMiring;

  // Method Setter - Getter
  /*
   * Setter=untuk set value atribute
   * Getter=untuk get value atribute
   */

  // Method Setter
  public void setAlas(int alasSegitiga) {
    alas = alasSegitiga;
  }

  public void setTinggi(int tinggi) {
    this.tinggi = tinggi;
  }

  public void setSisiMiring(int sisiMiring) {
    this.sisiMiring = sisiMiring;
  }

  // Method Getter
  public int getAlas() {
    return alas;
  }

  public int getTinggi() {
    return tinggi;
  }

  public int getSisiMiring() {
    return sisiMiring;
  }

  // Method custom
  public int getKeliling() {
    int keliling = alas + tinggi + sisiMiring;
    return keliling;
  }

  public float getLuas() {
    float luas = alas * tinggi / 2;
    return luas;
  }

  public void cetakSegitiga(int sisi) {
    for (int i = 0; i < sisi; i++) {
      for (int j = 0; j < sisi; j++) {
        if (i >= j) {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
