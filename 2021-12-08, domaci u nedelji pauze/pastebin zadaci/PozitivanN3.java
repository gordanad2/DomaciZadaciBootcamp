package vezbanje;

import java.util.Scanner;

/*Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n. [0,n]*/
public class PozitivanN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi pozitivan ceo broj: ");
        int n = sc.nextInt();
        int i = 0;

        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
