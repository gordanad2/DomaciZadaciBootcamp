package domaci0312;

import java.util.Scanner;

/*Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
        Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1.
        Dakle, npr:
        5! = 5 * 4 * 3 * 2 * 1 = 120
        3! = 3 * 2 * 1 = 6*/
public class Faktorijel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi broj: ");
        int n = sc.nextInt();

        int faktorijel = 1;

        for(n = n; n>=1; n--){
            faktorijel = faktorijel * n;
        }
        System.out.println("Faktorijel unetog broja je: " + faktorijel);
    }
}
