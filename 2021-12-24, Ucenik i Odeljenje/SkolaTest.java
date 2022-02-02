package domaci.nedelja5.domaci2112.Ucenik;

import java.util.ArrayList;

public class SkolaTest {
    public static void main(String[] args) {

        // pravljenje niza ocena koje bi se dodale u objekat
        ArrayList<Integer> nizOcena = new ArrayList<Integer>();
        nizOcena.add(5);
        nizOcena.add(4);
        nizOcena.add(3);
        nizOcena.add(1);

        Ucenik ucenik1 = new Ucenik("Petar", "Petrovic", nizOcena );
        Ucenik ucenik2 = new Ucenik("Ana", "Milovanovic");

        Odeljenje odeljenje1 = new Odeljenje("III-5");
        Odeljenje odeljenje2 = new Odeljenje("VII-3");

        odeljenje1.upisiUcenika(ucenik1);
        System.out.println(odeljenje1);

        odeljenje1.upisiUcenika(ucenik2, 1);
        System.out.println(odeljenje1);


    //    odeljenje1.pogledajOcene(1);
        odeljenje1.pogledajOcene(ucenik1);
        odeljenje1.prosecnaOcena(ucenik1);
        System.out.println("Prosecna ocena je: " + odeljenje1.prosecnaOcena(ucenik1));
        System.out.println("Prosecna ocena je: " + odeljenje1.prosecnaOcena(1));
        System.out.println("Prosecna ocena odeljenja je: " + odeljenje1.prosecnaOcenaOdeljenja());

        odeljenje1.opisnaOcena(ucenik1);
        odeljenje1.izlistajDnevnik();
        odeljenje1.velicinaOdeljenja();
/*        odeljenje1.ispisiUcenika(ucenik1);
        System.out.println(odeljenje1);

        odeljenje1.ispisiUcenika(0);
        System.out.println(odeljenje1);*/

    }
}
