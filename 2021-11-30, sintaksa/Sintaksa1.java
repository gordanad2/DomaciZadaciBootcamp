 /*Napisati program koji ce racunati povrsinu okrecene prostorije, tako sto se ivice prostorije
  * ucitavaju preko konzole. (za pretpostavku uzeti da prostorija ima zidove oblika
  *  pravougaonika i da nema prozora i vrata).
  */


import java.util.Scanner;

public class Sintaksa1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Unesite duzinu zida: ");
        int duzina = scanner.nextInt();
        System.out.print("Unesite visinu zida: ");
        int visina = scanner.nextInt();
        System.out.print("Unesite sirinu zida: ");
        int sirina = scanner.nextInt();
        // izracunavanje povrsine sabiranjem povrsine zidova i plafona
        int povrsina = 2*(duzina * visina) + 2*(sirina * visina) + (duzina*sirina);
        System.out.print("Povrsina okrecene prostorije je: " + povrsina);
    }
}
