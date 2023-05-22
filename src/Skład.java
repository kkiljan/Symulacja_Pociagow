import com.sun.xml.internal.bind.v2.model.runtime.RuntimeBuiltinLeafInfo;

import java.util.*;

public class Skład implements Runnable {

   public static List<Skład> listaSkładów = new ArrayList<>();

    Lokomotywa lokomotywa = null;

    List<Wagon> wagony = new ArrayList<>();


    StacjaKolejowa stacjaŹródłowa;
    StacjaKolejowa stacjaDocelowa;


    public Skład(StacjaKolejowa stacjaŹródłowa, StacjaKolejowa stacjaDocelowa) {
        this.stacjaŹródłowa = stacjaŹródłowa;
        this.stacjaDocelowa = stacjaDocelowa;
    }


    public void dodajLokomotywe(Lokomotywa lokomotywa) {
        this.lokomotywa = lokomotywa;
    }

    public void dołączWagon(Wagon wagonDołączany) throws BrakLokomotywyException, ZaDuzaWagaException, PrzekroczonoLimitWagonówException, PrzekroczonoLimitWagonówZelektryfikowanychException {
        if (Objects.isNull(lokomotywa)) {
            throw new BrakLokomotywyException("Brak lokomotywy, przed dołączeniem wagonów podstaw najpierw lokomotywę");
        }

        double aktualnaWaga = 0.0;
        int aktualnaLiczbaWagonów = 0;
        int aktualnaLiczbaWagonówZelektryfikowanych = 0;

        for (Wagon e : wagony) {
            aktualnaWaga += e.masa;
            aktualnaLiczbaWagonów += 1;
            if (e instanceof Zelektryfikowany) {
                aktualnaLiczbaWagonówZelektryfikowanych += 1;
            }
        }

        if (aktualnaLiczbaWagonów + 1 > lokomotywa.maxLiczbaWagonów) {

            throw new PrzekroczonoLimitWagonówException("Nie można dodać wagonu, przekroczono limit wagonów dla lokomotywy" + lokomotywa.nazwa);


        }
        if (wagonDołączany instanceof Zelektryfikowany && aktualnaLiczbaWagonówZelektryfikowanych + 1 > lokomotywa.maxLiczbWagonówPodPrądem) {

            throw new PrzekroczonoLimitWagonówZelektryfikowanychException("Nie można dodać wagonu, przekroczono limit wagonów zelektryfikowanych dla lokomotywy" + lokomotywa.nazwa);


        }


        if (aktualnaWaga + wagonDołączany.masa > lokomotywa.maxUciąg) {

            throw new ZaDuzaWagaException("Nie można dodać wagonu, przekroczono uciąg lokomotywy" + lokomotywa.nazwa);


        }
        wagony.add(wagonDołączany);
    }

    String generujRaport() {
        String raport = "";

        StringBuilder stringBuilder = new StringBuilder(raport);


        return raport;
    }

    @Override
    public void run() {
        StacjaKolejowa stacjaPoczątkowa = stacjaŹródłowa;
        StacjaKolejowa stacjaKońcowa = stacjaDocelowa;
        while (true) {

            GrafPołączeń grafPołączeń = new GrafPołączeń();

            List<StacjaKolejowa> ścieżka = null;
            ścieżka = grafPołączeń.znajdźŚcieżkęDFS(stacjaPoczątkowa, stacjaKońcowa);

            int długość= 0;
            for (StacjaKolejowa e : ścieżka) {
                długość +=1;
            }


            for (StacjaKolejowa e : ścieżka) {
                int temp = 0;
                try {
                    Thread.sleep(2000);
                    System.out.println("postój na stacji " + e.nazwa + " lokomotywy " + this.lokomotywa.nazwa);
                } catch (InterruptedException exc) {
                    return;
                }
            }

            try {
                Thread.sleep(30000);
                System.out.println("zawracam " + this.lokomotywa.nazwa);
            } catch (InterruptedException exc) {
                return;
            }

            StacjaKolejowa temp = stacjaKońcowa;
            stacjaKońcowa = stacjaPoczątkowa;
            stacjaPoczątkowa = temp;

        }

    }

//    List<StacjaKolejowa> wyznaczTrasę(GrafPołączeń grafPołączeń) {
//        Map<StacjaKolejowa, List<PołączenieMiędzyStacjami>> graf = GrafPołączeń.graf;
//        List<StacjaKolejowa> trasa = grafPołączeń.znajdźŚcieżkęDFS(stacjaŹródłowa,stacjaDocelowa);
//        return trasa;
//    }
}
