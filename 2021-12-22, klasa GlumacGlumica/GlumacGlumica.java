package domaci.nedelja5.domaci2112;

/*1) Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive,
        pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom) i da li je iz Srbije odgovorite
        preko booleana. Sve potrebno za glumca i glumicu da budu dva ispisa (edited)*/
public class GlumacGlumica {
    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean izSrbije;

    public GlumacGlumica(String ime, String prezime, char pol, int godine, double ocena, boolean izSrbije) {
        this.ime = ime;
        this.prezime = prezime;

        if (pol == 'M' || pol == 'm') {
            this.pol = pol;

        } else if (pol == 'Z' || pol == 'z') {
            this.pol = pol;

        } else {
            System.out.println("Uneli ste oznaku koja ne odgovara nijednom polu.");
        }

        if (godine < 0) {
            System.out.println("Godine ne mogu biti ispod 0.");
        } else {
            this.godine = godine;
        }
        if (ocena < 0 || ocena > 10) {
            System.out.println("Uneli ste ocenu koja ne postoji. ");
        } else {
            this.ocena = ocena;
        }
        this.izSrbije = izSrbije;
    }

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

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        if (pol == 'M' || pol == 'm') {
            this.pol = pol;
            System.out.println("Muski");

        } else if (pol == 'Z' || pol == 'z') {
            this.pol = pol;
            System.out.println("Zenski");
        } else {
            System.out.println("Uneli ste oznaku koja ne odgovara nijednom polu.");
        }
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        if (godine < 0) {
            System.out.println("Godine ne mogu biti ispod 0.");
        } else {
            this.godine = godine;
        }
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        if (ocena < 0 || ocena > 10) {
            System.out.println("Uneli ste ocenu koja ne postoji. ");
        } else {
            this.ocena = ocena;
        }
    }
    public boolean getIzSrbije() {
        return izSrbije;
    }

    public void setIzSrbije(boolean izSrbije) {
        this.izSrbije = izSrbije;
    }

    //toString

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(", pol: ");
        if(pol == 'M' || pol == 'm'){
            sb.append("muski");
        }
        else if(pol == 'Z' || pol == 'z'){
            sb.append("zenski");
        }
        sb.append(", ima ");
        sb.append(godine);
        sb.append("godine/a. ");
        sb.append("Ocenio bih glumca/glumicu ocenom: ");
        sb.append(ocena);
        sb.append(" Glumac/glumica ");
        if(izSrbije){
            sb.append("jeste iz Srbije. ");
        }
        else {
            sb.append("nije iz Srbije. ");
        }
        sb.append("\n");
        return sb.toString();

    }
}

