package domaci.nedelja6;

import java.util.ArrayList;

/*2. Array liste
        Kreirajte array listu nekog vaseg interesovanje (npr sport)
        -u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
        -iz liste dohvatite 3. element liste i ispisite
        -promenite naziv prvog elementa
        -uklonite 5. element
        -ispisite velicinu vase liste
        -pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste*/
public class ArrayListDomaci {
    public static void main(String[] args) {
        // kreirana lista interesovanja
        ArrayList<String> putovanje = new ArrayList<String>();
            putovanje.add("Bratislava");
            putovanje.add("Porto");
            putovanje.add("Lisabon");
            putovanje.add("Phi Phi");
            putovanje.add("Stokholm");
            putovanje.add("Moskva");

            // dohvatanje treceg elementa liste, preko indeksa koji je za jedan manji u odnosu na broj elementa
        // (posto index krece od 0)
        System.out.println(putovanje.get(2));

        //promena naziva prvog elementa
        putovanje.set(0, "Marakes");
        System.out.println(putovanje.get(0));

        //uklanjanje 5. elementa niza
        putovanje.remove(4);

        //velicina liste
        System.out.println(putovanje.size());

        //for petlja sa iteratorom i
        System.out.println("Ispis na prvi nacin: ");
        for(int i = 0; i < putovanje.size(); i++){
            System.out.print("Omiljeno putovanje " + (i + 1) + ": ");
            System.out.println(putovanje.get(i));
        }
        System.out.println();
        // for petlja kroz elemente
        System.out.println("Ispis na drugi nacin: ");
        int brojac = 1;
        for(String p: putovanje){
            System.out.print("Omiljeno putovanje " + brojac + ": ");
            System.out.println(p);
            brojac = brojac + 1;
        }
    }
}
