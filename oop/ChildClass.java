package oop;

/* Inheritance
 * Suatu class dapat diwarisi ke class lainnya
 * Keyword
 * 1. extends: Class - Class atau Interface ke Interface
 * 2. implement: Interface - Class
 */
public class ChildClass extends ParentClass {
  private String kalimat;

  /*
   * 1. super=representasi dari parent class
   * 2. this=representasi dari classnya sendiri
   */
  public ChildClass(String tulisan, int number, String kalimat) {
    super(tulisan, number);
    super.setTeks(kalimat);
    this.kalimat = tulisan;
    this.setKalimat(tulisan);
  }

  public ChildClass() {
  }

  public String getKalimat() {
    return kalimat;
  }

  public void setKalimat(String kalimat) {
    this.kalimat = kalimat;
  }

  // Override method
  @Override
  public void greeting(String sapa) {
    System.out.println(sapa + " ini berasal dari child class");
  }
}
