package vezbanje;
/* Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
         "Dobrodosao u {x}. razred, {ime} {prezime}",
         pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda.
          A ako korisnik nije djak ispisati jednu odgovarajucu
         poruku od:
         "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"*/

import java.util.Scanner;

public class Skolovanje8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi ime: ");
        String ime = sc.next();

        System.out.println("Unesi prezime: ");
        String prezime = sc.next();

        System.out.println("Unesi godinu rodjenja: ");
        int godinaRodjenja = sc.nextInt();

        int godineZivota = 2021 - godinaRodjenja;
        int x = godineZivota - 7;

        if(x <= 12 && x > 0){
            System.out.println("Dobrodosao/la u " + x + ". razred, " + ime + " " + prezime + "!");
        }
        else if( x > 12){
            System.out.println(ime + " " + prezime + " je zavrsio/la skolu!");
        }
        else{
            System.out.println(ime + " " + prezime + " tek treba da zapocne skolovanje!");
        }
    }
}
