package vezbanje;

import java.util.Scanner;

/*Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.*//*[n,0]*/
public class NegativanN4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi negativan ceo broj: ");
        int n = sc.nextInt();

        while (0 >=n){
            System.out.println(n);
            n++;

        }
    }
}
