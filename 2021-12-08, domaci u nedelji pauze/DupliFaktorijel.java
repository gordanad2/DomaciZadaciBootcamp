package domaci.domaci0812;

import java.util.Scanner;

/*1.[Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetg broja n. Dupli faktorijel broja n je:
        n!! = n * (n-2) * (n-4) * ... * (2 ili 1)*/
public class DupliFaktorijel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int n = sc.nextInt();
        int df = 1;

        for(int i = n; i >= 2 || i>=1; i = i - 2){
            df = df * i;
        }
        System.out.println(df);
    }
}
