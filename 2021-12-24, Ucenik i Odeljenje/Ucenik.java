package domaci.nedelja5.domaci2112.Ucenik;

import java.util.ArrayList;

/*9.
        Napisati klasu Ucenik koja ima sledeca polja:
        - String ime
        - String prezime
        - ArrayList ocene

        Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime,
        a ocene postavlja na praznu listu.
        Napisati gettere i settere za sva polja.
        Napisati toString() metod:
        {ime} i {prezime} ima ocene:
        {ocene}
        Napisati metod proske koji racuna prosek Ucenika.*/
public class Ucenik {
    // polja
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    //konstruktori
    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene){
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }

    public Ucenik(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = new ArrayList<Integer>();

    }

    // getteri i setteri
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }
    // toString
/*    Napisati toString() metod:
    {ime} i {prezime} ima ocene:
    {ocene}*/
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(" ima ocene: ");
        for(Integer ocena: ocene ){
            sb.append(ocena);
            sb.append(" ");
        }
        return sb.toString();
    }
    public double prosek(){
        double prosekUcenika = 0;
        double zbirOcena = 0;
        double brojOcena = 0;
        for(Integer ocena: ocene){
            zbirOcena += ocena;
            brojOcena++;
        }
        prosekUcenika = zbirOcena / brojOcena;
        return prosekUcenika;
    }
}
