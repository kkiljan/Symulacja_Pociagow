public class StacjaKolejowa {

String nazwa;

double długośćPeronu = 0.0;
boolean czyWłączoneOświetlenie = false;


    public StacjaKolejowa(String nazwa, double długośćPeronu) {
        this.nazwa = nazwa;
        this.długośćPeronu = długośćPeronu;
    }

    public void włączOświetlenie () {
        czyWłączoneOświetlenie = true;
    }


    public void wyłączOświetlenie () {
        czyWłączoneOświetlenie = false;
    }
}
