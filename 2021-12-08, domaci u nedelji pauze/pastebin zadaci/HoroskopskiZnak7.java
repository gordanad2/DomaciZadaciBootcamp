package vezbanje;

import java.util.Scanner;

/*Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.*/
/*Ovan – od 21. marta do 20. aprila;
Bik – od 21. aprila do 21. maja;
Blizanci – od 22. maja do 21. juna;
Rak – od 22. juna do 22. jula;
Lav – od 23. jula do 22. avgusta;
Devica – od 23. avgusta do 22. septembra;
Vaga – od 23. septembra do 23.oktobra;
Škorpija – od 24. oktobra do 22. novembra;
Strelac – od 23. novembra do 21. decembra;
Jarac – od 22. decembra do 20. januara;
Vodolija – od 21. januara do 19. februara;
Ribe – od 20. februara do 20. marta;*/

public class HoroskopskiZnak7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi mesec rodjenja (brojem):  ");
        int mesec = sc.nextInt();
        System.out.println("Unesi dan rodjenja (datum u mesecu): ");
        int dan = sc.nextInt();

        if (((dan >= 21 && dan <= 31) && mesec == 3) || ((dan >= 1 && dan <= 20) && mesec == 4)) {
            System.out.println("Vi ste ovan u znaku.");
        } else if (((dan >= 21 && dan <= 30) && mesec == 4) || ((dan >= 1 && dan <= 21) && mesec == 5)) {
            System.out.println("Vi ste bik u znaku.");
        } else if (((dan >= 22 && dan <= 31) && mesec == 5) || ((dan >= 1 && dan <= 21) && mesec == 6)) {
            System.out.println("Vi ste blizanac u znaku.");
        } else if (((dan >= 22 && dan <= 30) && mesec == 6) || ((dan >= 1 && dan <= 22) && mesec == 7)) {
            System.out.println("Vi ste rak u znaku.");
        } else if (((dan >= 23 && dan <= 31) && mesec == 7) || ((dan >= 1 && dan <= 22) && mesec == 8)) {
            System.out.println("Vi ste lav u znaku.");
        } else if (((dan >= 23 && dan <= 31) && mesec == 8) || ((dan >= 1 && dan <= 22) && mesec == 9)) {
            System.out.println("Vi ste devica u znaku.");
        } else if (((dan >= 23 && dan <= 30) && mesec == 9) || ((dan >= 1 && dan <= 23) && mesec == 10)) {
            System.out.println("Vi ste vaga u znaku.");
        } else if (((dan >= 24 && dan <= 31) && mesec == 10) || ((dan >= 1 && dan <= 22) && mesec == 11)) {
            System.out.println("Vi ste skorpija u znaku.");
        } else if (((dan >= 23 && dan <= 30) && mesec == 11) || ((dan >= 1 && dan <= 21) && mesec == 12)) {
            System.out.println("Vi ste strelac u znaku.");
        } else if (((dan >= 22 && dan <= 31) && mesec == 12) || ((dan >= 1 && dan <= 20) && mesec == 1)) {
            System.out.println("Vi ste jarac u znaku.");
        } else if (((dan >= 21 && dan <= 31) && mesec == 1) || ((dan >= 1 && dan <= 19) && mesec == 2)) {
            System.out.println("Vi ste vodolija u znaku.");
        } else if (((dan >= 20 && dan <= 29) && mesec == 2) || ((dan >= 1 && dan <= 20) && mesec == 3)) {
            System.out.println("Vi ste riba u znaku.");
        }
    }
}
