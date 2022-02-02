package domaci.domaci1712;
/*41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.*/

public class ProsecnaVrednostNiza41 {
    public static void main(String[] args) {

        double[] niz1 = {1.5, 2.6, 3.54, 8.42, 9.20};
        double[] niz2 = {3.2, -5.1, 2, 3.5, 0};

        System.out.print("Prosecna vrednost zadatog niza je: ");
        System.out.println(prosecnaVrednost(niz1));

        System.out.print("Prosecna vrednost zadatog niza je: ");
        System.out.println(prosecnaVrednost(niz2));
    }
    public static double prosecnaVrednost(double[] x){
        double suma = 0;
        for(int i = 0; i < x.length; i++){
            suma = suma + x[i];
        }
        int brojElemenata = x.length;
        double prosek = suma / x.length;
        return prosek;
    }
}
