package oop;

// Implements suatu interface
public class Lingkaran implements BangunDatar {
  // Atribute
  private int jariJari;

  // Constructor
  public Lingkaran() {
  }

  public Lingkaran(int jariJari) {
    this.jariJari = jariJari;
  }

  // Setter - Getter
  public int getJariJari() {
    return jariJari;
  }

  public void setJariJari(int jariJari) {
    this.jariJari = jariJari;
  }

  // Methods
  @Override
  public double calculateKeliling() {
    // TODO Auto-generated method stub
    Double keliling = 2 * Math.PI * this.jariJari;
    return keliling;
  }

  @Override
  public double calculateLuas() {
    // TODO Auto-generated method stub
    Double luas = Math.PI * jariJari * jariJari;
    return luas;
  }

  @Override
  public void printShape() {
    // TODO Auto-generated method stub
    System.out.println("LINGKARAN");
  }

}
