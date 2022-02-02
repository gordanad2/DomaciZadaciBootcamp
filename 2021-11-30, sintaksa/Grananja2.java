/*
Sintaksa1 uraditi ponovo, koristeci grananja kako bismo se ogradili od nemogucih izracunavanja povrsina
(kakvi celi brojevi moraju da budu visina, sirina i duzina?)*/

import java.util.Scanner;

public class Grananja2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Unesite duzinu zida: ");
        int duzina = scanner.nextInt();
        System.out.print("Unesite visinu zida: ");
        int visina = scanner.nextInt();
        System.out.print("Unesite sirinu zida: ");
        int sirina = scanner.nextInt();
        if( duzina <= 0 || visina <= 0 || sirina <=0 ){
            System.out.println("Unete vrednosti ne zadovoljavaju kriterijum (jedna ili vise vrednosti su jednake ili manje od nule)");
        }
        else{
            // izracunavanje povrsine sabiranjem povrsine zidova i plafona
            int povrsina = 2 * (duzina * visina) + 2 * (sirina * visina) + (duzina * sirina);
            System.out.print("Povrsina okrecene prostorije je: " + povrsina);
        }
    }
}
