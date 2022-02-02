package domaci.nedelja5.domaci2112;

import java.util.Scanner;

public class Voznja {
    public static void main(String[] args) {


        Automobil auto1 = new Automobil("KIA", "Ceed", 1585123564, "Ivana Radovanovic");
        Automobil auto2 = new Automobil("Lancia", "Y", 1557556464 );

        System.out.println("Ovo je automobil marke " + auto1.getMarka() + ", model je " + auto1.getModel());
        System.out.println("Njegov serijski broj je: " + auto1.getSerijskiBroj());
        System.out.println("Vlasnik ovog automobila je: " + auto1.getVlasnik());
        System.out.println();

        System.out.println("Ovo je automobil marke " + auto2.getMarka() + ", model je " + auto2.getModel());
        System.out.println("Njegov serijski broj je: " + auto2.getSerijskiBroj());
        System.out.println("Vlasnik ovog automobila je: " + auto2.getVlasnik());
        System.out.println();

        auto2.setVlasnik("Milena Radovic");
        System.out.println("Vlasnik" + auto2.getMarka() + " automobila je "  + auto2.getVlasnik());
    }
}
