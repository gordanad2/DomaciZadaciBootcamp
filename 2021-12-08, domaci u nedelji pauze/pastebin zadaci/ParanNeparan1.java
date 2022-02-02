package vezbanje;
/*Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.*/

import java.util.Scanner;

public class ParanNeparan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi broj: ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("Broj je paran.");
        }else{
            System.out.println("Broj je neparan.");
        }
    }
}
