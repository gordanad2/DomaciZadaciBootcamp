package domaci.domaci0812;
/*3.[Naizmenicna suma] Korisnik unosi vrednost broja n (int) sa konzole.
        Na standardni izlaz ispisati resenje izraza:
        1 - 2 + 3 - .... (+/-) n.*/

import java.util.Scanner;

public class NaizmenicnaSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi broj: ");
        int n = sc.nextInt();
        int suma = 0;

        for(int i = 1; i<=n; i++){
            if(i % 2 == 0){
                suma = suma - i;
            }
            else{
                suma = suma + i;
            }
        }
        System.out.println(suma);
    }
}
