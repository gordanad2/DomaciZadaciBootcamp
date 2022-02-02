package domaci.nedelja5.domaci2112;
/*Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta)
        sve tipove metoda napisanih u klasi Sportista*/
public class Igraci {
    public static void main(String[] args) {

        Sportista igrac1 = new Sportista("Milan Milovanovic", "kosarka", "Crvena Zvezda", 23);
        Sportista igrac2 = new Sportista("Jovana Vukadinovic", "odbojka", "Partizan", 2);
        Sportista igrac3 = new Sportista("Jelena Lazic", "fudbal", "Radnicki", 12);

        System.out.println("Sportista/kinja" + igrac1.getImeIPrezime() + " bavi se sportom: " + igrac1.getSport());
        System.out.println("Igra za klub " + igrac1.getKlub() + " i na dresu nosi broj " + igrac1.getbrojNaDresu());
        System.out.println();

        System.out.println("Sportista/kinja" + igrac2.getImeIPrezime() + " bavi se sportom: " + igrac2.getSport());
        System.out.println("Igra za klub " + igrac2.getKlub() + " i na dresu nosi broj " + igrac2.getbrojNaDresu());
        System.out.println();

        System.out.println("Sportista/kinja" + igrac3.getImeIPrezime() + " igra za klub " + igrac3.getKlub() + " i nosi broj na dresu " + igrac3.getbrojNaDresu());
        igrac3.setKlub("Zeleznicar");
        igrac3.setBrojNaDresu(15);
        System.out.println("Sportista/kinja" + igrac3.getImeIPrezime() + " je promenila klub i sada igra za " + igrac3.getKlub() + " i nosi broj na dresu " + igrac3.getbrojNaDresu());

    }
}
