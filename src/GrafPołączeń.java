import java.util.*;

class GrafPołączeń {
    public static Map<StacjaKolejowa, List<PołączenieMiędzyStacjami>> graf = new HashMap<>(); // lista sąsiedztwa


    void dodajStacje(StacjaKolejowa stacjaKolejow) {
        graf.put(stacjaKolejow, new ArrayList<>());
    }

    void dodajPołączenieMiędzyStacjami(StacjaKolejowa stacjaPoczątkowa, StacjaKolejowa stacjaKońcowa, double odległość) {
        PołączenieMiędzyStacjami krawędź = new PołączenieMiędzyStacjami(odległość, stacjaPoczątkowa, stacjaKońcowa);
        PołączenieMiędzyStacjami krawędź2 = new PołączenieMiędzyStacjami(odległość, stacjaKońcowa, stacjaPoczątkowa);

        graf.get(stacjaPoczątkowa).add(krawędź);
        graf.get(stacjaKońcowa).add(krawędź2);

    }



    void drukujGraf() {

        for (Map.Entry<StacjaKolejowa, List<PołączenieMiędzyStacjami>> e : graf.entrySet()) {
            System.out.print(e.getKey().nazwa);

            for (PołączenieMiędzyStacjami połączenie : e.getValue()) {
                System.out.print("[" + połączenie.stacjaKońcowa.nazwa + ", " + połączenie.odległość + "] ");
            }
            System.out.println();
        }
    }


    public List<StacjaKolejowa> znajdźŚcieżkęDFS(StacjaKolejowa stacjaPoczątkowa, StacjaKolejowa stacjaKońcowa) {
        Set<StacjaKolejowa> odwiedzone = new HashSet<>();
        Stack<StacjaKolejowa> stos = new Stack<>();
        Map<StacjaKolejowa, StacjaKolejowa> poprzednicy = new HashMap<>();

        stos.push(stacjaPoczątkowa);
        odwiedzone.add(stacjaPoczątkowa);

        while (!stos.empty()) {
            StacjaKolejowa stacjaBieżąca = stos.pop();
            if (stacjaBieżąca == stacjaKońcowa) {
                break;
            }

            for (PołączenieMiędzyStacjami połączenie : graf.get(stacjaBieżąca)) {
                StacjaKolejowa stacjaSąsiednia = połączenie.stacjaKońcowa;
                if (!odwiedzone.contains(stacjaSąsiednia)) {
                    odwiedzone.add(stacjaSąsiednia);
                    stos.push(stacjaSąsiednia);
                    poprzednicy.put(stacjaSąsiednia, stacjaBieżąca);
                }
            }
        }

        List<StacjaKolejowa> ścieżka = new ArrayList<>();
        if (!poprzednicy.containsKey(stacjaKońcowa)) {
            return ścieżka;
        }

        StacjaKolejowa stacjaBieżąca = stacjaKońcowa;
        while (stacjaBieżąca != stacjaPoczątkowa) {
            ścieżka.add(0, stacjaBieżąca);
            stacjaBieżąca = poprzednicy.get(stacjaBieżąca);
        }
        ścieżka.add(0, stacjaPoczątkowa);

        return ścieżka;
    }








}

