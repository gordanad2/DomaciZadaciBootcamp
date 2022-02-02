package domaci.nedelja5.domaci2112.Ucenik;

import java.util.ArrayList;

public class Odeljenje {

    //polja
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    //konstruktori
    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik){
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka){
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>();
    }
    //getteri i setteri
    public String getOznaka(){
        return oznaka;
    }
    public void setOznaka(String oznaka){
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }
    public void setDnevnik(ArrayList<Ucenik> dnevnik){
        this.dnevnik = dnevnik;
    }
    //toString
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka);
        sb.append(" odeljenje ima djake: ");
        sb.append("\n");
        for(Ucenik u: dnevnik){

            sb.append(dnevnik.indexOf(u) + 1);
            sb.append(". ");
            sb.append(u.getIme());
            sb.append(" ");
            sb.append(u.getPrezime());
            sb.append("\n");
        }
        return sb.toString();
        }
    //      Metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
    public void upisiUcenika(Ucenik u){
        dnevnik.add(u);
    }

   // Metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}

    public void upisiUcenika(Ucenik u, int redniBroj){
        redniBroj = dnevnik.indexOf(u) + 1;
        dnevnik.add(redniBroj, u);
    }

   // Metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.

    public void ispisiUcenika(Ucenik u){
        dnevnik.remove(u);
    }

   // Metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.

    public void ispisiUcenika(int i){
        for(int j = 0; j < dnevnik.size(); j++ ){
            if(dnevnik.indexOf(j) == (i - 1)){
                dnevnik.remove(j);
            }
        }
    }

   // Metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.

   public void pogledajOcene(Ucenik u){
        for(Ucenik ucenik : dnevnik){
            if(ucenik == u){
                ucenik.getOcene();
                System.out.println(u.getOcene());
            }
        }
        }

   // Metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
        public void pogledajOcene(int i){
            for(Ucenik u: dnevnik){
                if(dnevnik.indexOf(u) == i){
                    System.out.println(u.getOcene());
                }
            }
        }

   // Metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.
    public double prosecnaOcena(Ucenik u){
        double prosek = 0;
        double suma = 0;
        ArrayList<Integer> ocene = u.getOcene();
            for(Ucenik ucenik : dnevnik){
                if(ucenik == u){
                    for(int i = 0; i < ocene.size() ; i++){
                        suma = suma + ocene.get(i);
                    }
                }
                prosek = suma / ocene.size();
            }
            return prosek;
    }
//    Metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
    public double prosecnaOcena(int i) {
        double prosek = 0;
        double suma = 0;
        ArrayList<Integer> ocene = new ArrayList<Integer>();
        for (Ucenik ucenik : dnevnik) {
            if (dnevnik.indexOf(ucenik) == i) {
                ocene = ucenik.getOcene();
            }
        }
        for (int j = 0; j < ocene.size(); j++) {
            suma = suma + ocene.get(j);
        }
        prosek = suma / ocene.size();

        return prosek;
    }

//   Metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).

      public double prosecnaOcenaOdeljenja() {
        //zbir proseka svih ucenika
          double zbirProseka = 0;
          //prosek jednog ucenika
          double suma = 0;
          //broji ucenike koji imaju ocene
          double brojac = 0;
          //prosecna ocena Odeljenja
          double prosek = 0;
          ArrayList<Integer> ocene = new ArrayList<Integer>();
          if(dnevnik.isEmpty()){
              return 0;
          }
          else{
              for (Ucenik ucenik : dnevnik) {
                  if (ucenik.getOcene().isEmpty() == false) {
                      ocene = ucenik.getOcene();
                      for (int j = 0; j < ocene.size(); j++) {
                          suma = suma + ocene.get(j);
                      }
                      zbirProseka = zbirProseka + (suma / ocene.size());
                      brojac++;
                  }
              }
              prosek = zbirProseka / brojac;
              return prosek;
          }
      }

  /* Metod opisnaOcena(Ucenik u) koja ispisuje:
            - "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
        - "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
            - "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
            - "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
            - "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu */

    public void opisnaOcena(Ucenik u){
        if(u.getOcene().contains(1)){
            System.out.println("Nedovoljan");
        }
        else if(prosecnaOcena(u) > 4.5){
            System.out.println("Odlican");
        }
        else if(prosecnaOcena(u) > 3.5){
            System.out.println("Vrlo dobar");
        }
        else if(prosecnaOcena(u) > 2.5){
            System.out.println("Dobar");
        }
        else if(prosecnaOcena(u) > 1.5){
            System.out.println("Dovoljan");
        }
        else{
            System.out.println("Ucenik nema ocene. ");
        }

    }

  /*  Metod izlistajDnevnik() koja vraca String oblika:
    {ime} i {prezime} ima ocene:
    {ocene}
    za sve ucenike.*/
    public void izlistajDnevnik(){
        for(Ucenik u: dnevnik){
            System.out.println(u.getIme() + " " + u.getPrezime() + " ima ocene: ");
            if(u.getOcene().isEmpty()){
                System.out.println("Ucenik/ca nema ocene");
            }
            else {
                System.out.println(u.getOcene());
            }
            System.out.println();
        }
    }

    /*
    Metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
            - "Veliko odeljenje"; ako ima vise od 25 ucenika
        - "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
            - "Malo odeljenje"; ako ima ucenika manje od 15 */

    public void velicinaOdeljenja(){
        if(dnevnik.size() > 25){
            System.out.println("Veliko odeljenje. ");
        }
        else if(dnevnik.size() > 15){
            System.out.println("Srednje odeljenje.");
        }
        else if(dnevnik.size() < 15 && dnevnik.size() > 0){
            System.out.println("Malo odeljenje. ");
        }
        else{
            System.out.println("Odeljenje nema ucenika. ");
        }
        }
    }

