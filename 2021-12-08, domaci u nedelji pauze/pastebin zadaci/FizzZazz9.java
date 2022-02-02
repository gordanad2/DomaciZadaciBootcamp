package vezbanje;

import java.util.Scanner;

/* Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3, "Buzz" ako je deljiv sa 5,
         "Zazz" ako je deljiv sa 7 i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)*/
public class FizzZazz9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi ceo broj: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print(i + ": ");
            if(i % 3 == 0){
                System.out.print("Fizz");
            }
            if(i % 5 == 0){
                System.out.print("Buzz");
            }
            if(i % 7 == 0){
                System.out.print("Zazz");
            }
            System.out.println();
        }
    }

}
