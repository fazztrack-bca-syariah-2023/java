package bangunDatar;

import java.util.Scanner;

public class Persegi {
  // declare global atribute
  public int sisiPersegi;

  // buat method / function
  /*
   * type method
   * 1. void: method yg tidak mengembalikan data
   * 2. return: mengembalikan suatu data
   */
  public void cetakSisi() {
    System.out.println(sisiPersegi);
  }

  public int getSisi() {
    return sisiPersegi;
  }

  public int getValue(int data) {
    return data;
  }

  public void cetakKeliling() {
    System.out.println("Keliling: " + 4 * sisiPersegi);
  }

  // Buatkan method untuk mencetak luas persegi
  public void cetakLuas() {
    System.out.println("Luas: " + sisiPersegi * sisiPersegi);
  }

  public static void main(String[] args) {
    // deklarasi object
    Scanner input = new Scanner(System.in);
    /*
     * Scanner = class untuk input data
     * input = nama object scanner
     * new = proses untuk instance object
     * Scanner() = constructor
     */

    // dekalarasi atribut
    int sisi, keliling, luas;
    String namaBangun = "Persegi";

    // sisi = 20;
    // keliling = 4 * sisi;
    // luas = sisi * sisi;

    System.out.print("Input sisi: ");
    sisi = input.nextInt();
    keliling = 4 * sisi;
    luas = sisi * sisi;

    System.out.println("=====" + namaBangun + "=====");

    System.out.println("""
          ini merupakan print untuk multiple line
          jadi bisa cetak beberapa baris
        """);

    System.out.print("sisi: ");
    System.out.println(sisi);

    System.out.print("hitung keliling: ");
    System.out.println(keliling);

    System.out.print("hitung luas: ");
    System.out.println(luas);

    // instance second persegi
    SecondPersegi sPersegi = new SecondPersegi();
  }
}

// default modifier / tanpa modifier
class SecondPersegi {

}