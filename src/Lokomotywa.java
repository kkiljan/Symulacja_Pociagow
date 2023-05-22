import jdk.nashorn.internal.ir.SplitReturn;

import java.util.Random;

public class Lokomotywa extends Tabor implements Runnable {


    int maxLiczbaWagonów;
    double maxUciąg;
    int maxLiczbWagonówPodPrądem;

    String nazwa;
    StacjaKolejowa stacjaMacierzysta;


    double prędkość;

    //metoda - nowy wątek i co sekundę zmienia prędkość o 3% losowo w górę lub w doł


    public Lokomotywa(int maxLiczbaWagonów, double maxUciąg, int maxLiczbWagonówPodPrądem, String nazwa, StacjaKolejowa stacjaMacierzysta, double prędkość) {
        this.maxLiczbaWagonów = maxLiczbaWagonów;
        this.maxUciąg = maxUciąg;
        this.maxLiczbWagonówPodPrądem = maxLiczbWagonówPodPrądem;
        this.nazwa = nazwa;
        this.stacjaMacierzysta = stacjaMacierzysta;

        this.prędkość = prędkość;


    }

    public void run() {

        while(true) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException exc) { return; }

            Random random = new Random();
            if (random.nextDouble() > 0.5){
                prędkość = prędkość * 1.03;
            }else {
                prędkość = prędkość * 0.97;
            }

            try {
                if (prędkość >200){
                    throw new NiebezpiecznaPrędkośćException("Pociąg " + this.nazwa + " osiągnął prędkość powyżej 200km/h");
                }

            } catch (NiebezpiecznaPrędkośćException e){
                System.out.println(e.toString());

            }

          //  System.out.println(this.nazwa + " " + prędkość);
        }

    }





}
