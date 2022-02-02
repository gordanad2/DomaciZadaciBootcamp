package domaci.nedelja5.domaci2112;
/*vozilo  - Napisati klasu Automobil. Automobil ima
        1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
        2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
        3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
        Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
        Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
        Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.*/
public class Automobil {
    private String marka;
    private String model;
    private int serijskiBroj;
    private String vlasnik;

    public Automobil(String marka, String model, int serijskiBroj, String vlasnik) {
        this.marka = marka;
        this.model = model;
        if(serijskiBroj < 0){
            System.out.println("Serijski broj ne moze biti negativan.");
        }
        else {
            this.serijskiBroj = serijskiBroj;
        }
        this.vlasnik = vlasnik;
    }
    public Automobil(String marka, String model, int serijskiBroj) {
        this.marka = marka;
        this.model = model;
        if(serijskiBroj < 0){
            System.out.println("Serijski broj ne moze biti negativan.");
        }
        else {
            this.serijskiBroj = serijskiBroj;
        }
        this.vlasnik = "Ovaj automobil nema vlasnika";
    }

    public String getMarka(){
        return marka;
    }
    public String getModel(){
        return model;
    }
    public int getSerijskiBroj(){
        return serijskiBroj;
    }

    public String getVlasnik(){
        return vlasnik;
    }
    public void setVlasnik(String vlasnik){
        this.vlasnik = vlasnik;
    }
}
