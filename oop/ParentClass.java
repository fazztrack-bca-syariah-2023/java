package oop;

public class ParentClass {
  // Atribut
  private String teks;
  private int angka;

  // Constructor
  // Default constructor / constructor tanpa parameter
  public ParentClass() {

  }

  // Constructor berparameter
  public ParentClass(String tulisan, int number) {
    this.teks = tulisan;
    this.angka = number;
  }

  public ParentClass(String tulisan, int number, String contoh) {
    this.teks = tulisan;
    this.angka = number;
  }

  public String getTeks() {
    return teks;
  }

  /*
   * Polymorphism, banyak bentuk
   * 1. Overload, duplikat method atau constructor dengan dibedakan parameternya
   * 2. Override
   */
  public String getTeks(String text) {
    System.out.println("ini text dari method getTeks " + text);
    return teks;
  }

  public void setTeks(String teks) {
    this.teks = teks;
  }

  public int getAngka() {
    return angka;
  }

  public void setAngka(int angka) {
    this.angka = angka;
  }

  public void greeting(String sapa) {
    System.out.println(sapa + " ini berasal dari parent class");
  }
}
