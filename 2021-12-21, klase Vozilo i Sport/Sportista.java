package domaci.nedelja5.domaci2112;
/*sport - Napisati klasu Sportista. Sportista ima
        1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
        2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
        3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
        4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi.
        Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta)
        sve tipove metoda napisanih u klasi Sportista.*/
public class Sportista {
    private String imeIPrezime;
    private String sport;
    private String klub;
    private int brojNaDresu;

  public Sportista(String imeIPrezime, String sport, String klub, int brojNaDresu){
      this.imeIPrezime = imeIPrezime;
      this.sport = sport;
      this.klub = klub;
      this.brojNaDresu = brojNaDresu;
  }
  public String getImeIPrezime(){
      return imeIPrezime;
  }

  public String getSport(){
      return sport;
  }

  public String getKlub(){
      return klub;
  }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public int getbrojNaDresu(){
      return brojNaDresu;
    }

    public void setBrojNaDresu(int brojNaDresu){
      this.brojNaDresu = brojNaDresu;
    }
}
