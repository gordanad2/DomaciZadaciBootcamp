package domaci.domaci1712;
/*42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".*/

public class ProveraStringa42 {
    public static void main(String[] args) {
        // Provera sa nizom kada postoji trazeno ime
        String[] imena = {"Ana", "Ljubica", "Isidora", "Aleksa", "Mila", "Petar", "Jana", "Marija", "Marko"};
        String[] imena3 = {"Milos", "Jelena", "Ljubica", "Petar", "Isidora", "Danilo"};
        // Provera sa nizom kada ne postoji trazeno ime
        String[] imena2 = {"Sava", "Djordje", "Marko", "Momcilo", "Anastasija", "Nadezda", "Snezana", "Teodora"};

        // provera da li postoji jedno od imena u nizu, bez provere koje je konkretno ime u pitanju
        if(proveraImena(imena2)){
            System.out.println("Trazeno ime postoji u zadatom nizu.");
        }
        else{
            System.out.println("Trazeno ime ne postoji u datom nizu. ");
        }

        // provera koje konkretno ime je prvo nadjeno u nizu
        if(proveraKonkretnogImena(imena2) == ""){
            System.out.println("Trazeno ime ne postoji u datom nizu. ");
        }
        else{
            System.out.print("Prvo trazeno ime u nizu je ");
            System.out.print(proveraKonkretnogImena(imena));
            System.out.println(".");
        }

    }
    // funckija koja proverava da li se neko od trazenih imena nalazi u nizu
    public static boolean proveraImena(String[] x){
        boolean trazenoIme = false;
        for(int i = 0; i < x.length; i++){
            if(x[i].equals("Marija") || x[i].equals("Petar")){
                trazenoIme = true;
            }
        }
        return trazenoIme;
    }

    // funkcija koja provera koje ime je pronadjeno prvo u nizu
    public static String proveraKonkretnogImena(String[] x){
        String trazenoIme = "";
        for(int i = 0; i < x.length; i++){
            if(x[i].equals("Marija")){
                trazenoIme = x[i];
            }
            else if(x[i].equals("Petar")){
                trazenoIme = x[i];
            }
        }
        return trazenoIme;
        }
}
