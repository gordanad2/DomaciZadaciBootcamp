

/*Grananja3: Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana.
 (Vodite racuna o prestupnoj godini!)*/

import java.util.Scanner;

public class Grananja3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Unesite godinu: ");
        int godina = scanner.nextInt();
        System.out.print("Unesite mesec u godini(brojem): ");
        int mesec = scanner.nextInt();
            if(mesec <= 0 || mesec > 12){
                System.out.println("Brojevi za mesece u godini moraju uci u skup izmedju 1 i 12.");
            }
            else if(mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10 || mesec == 12){
                System.out.println("Mesec ima 31 dan.");
            }
            else if(mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11){
                System.out.println("Mesec ima 30 dana.");
            }
            else if(mesec == 2 && godina % 4 == 0){
                System.out.println("Mesec ima 29 dana.");
            }
            else{
                System.out.println("Mesec ima 28 dana.");
        }

    }
}
