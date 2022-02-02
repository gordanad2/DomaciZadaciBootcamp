package domaci0312;
/*Aritmeticke opracije
        Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim redovima zbir,
        razliku, proizvod, kolicnik i ostatak deljenja prvog broja drugim tim redom*/

import java.util.Scanner;

public class AritmetickeOperacije {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        int a = sc.nextInt();
        System.out.println("Unesi drugi broj: ");
        int b = sc.nextInt();

        int zbir = a + b;
        int razlika = a - b;
        int proizvod = a * b;
        int kolicnik = a / b;
        int ostatak = a % b;

        System.out.println("Zbir dva uneta broja je " + zbir + ".");
        System.out.println("Rezultat oduzimanja prvog broja drugim brojem je " + razlika + ".");
        System.out.println("Proizvod dva uneta broja je " + proizvod + ".");
        System.out.println("Rezultat celobrojnog deljenja prvog broja drugim brojem je " + kolicnik + ".");
        System.out.println("Ostatak deljenja prvog broja drugim brojem je " + ostatak + ".");
    }
}
