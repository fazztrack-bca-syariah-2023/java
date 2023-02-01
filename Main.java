import oop.BangunDatar;
import oop.ChildClass;
import oop.DateImplement;
import oop.Lingkaran;
import oop.ParentClass;

public class Main {
  public static void main(String[] args) {
    // Instance parent class
    ParentClass pClass = new ParentClass();
    pClass.setTeks("halo");
    pClass.setAngka(100);

    System.out.println("pclass: " + pClass.getTeks() + " " + pClass.getAngka());

    pClass = new ParentClass("world", 200);

    // Instance child class
    ChildClass cClass = new ChildClass();
    cClass.setTeks("Dunia");
    cClass.setAngka(20);
    cClass.setKalimat("Ini merupakan suatu kalimat");

    System.out.println("pclass: " + pClass.getTeks() + " " + pClass.getAngka());
    System.out.println("cclass: " + cClass.getTeks() + " " + cClass.getAngka());
    System.out.println(pClass.getTeks("tulisan"));
    pClass.greeting("halo");
    cClass.greeting("selamat pagi");

    ChildClass childClass = new ChildClass();
    childClass.setAngka(39);
    System.out.println("get atribute from parent: " + childClass.getAngka());

    ChildClass childClass2 = new ChildClass("halo", 29, "teman-teman");
    System.out.println("get angka from parent: " + childClass2.getAngka());

    // instance interface object
    BangunDatar lingkaran = new Lingkaran(7);
    System.out.println("Luas: " + lingkaran.calculateLuas());
    System.out.println("Keliling: " + lingkaran.calculateKeliling());

    // contoh pemanggilan static method atau atribute
    // dipanggil dari classnya
    DateImplement dateImplement = new DateImplement();
    // DateImplement.contoh = "tulisan";
    DateImplement.setContoh("tulisan contoh");
  }
}
