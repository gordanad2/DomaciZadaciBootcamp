package domaci.domaci0812;

import java.util.Scanner;

/*2.[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].*/
public class SumaIntervala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int n = sc.nextInt();

        System.out.println("Unesi drugi broj, manji ili jednak prvom broju: ");
        int m = sc.nextInt();

        int suma = 0;
        for(int i = m; i<=n; i++){
            suma = suma + i;
        }
        System.out.println(suma);
    }
}
