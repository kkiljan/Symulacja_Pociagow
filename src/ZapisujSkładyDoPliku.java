import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ZapisujSkładyDoPliku implements Runnable{

    @Override
    public void run() {

        try {
            FileWriter plikDoZapisu = new FileWriter("./src/AppState.txt", true);

        while (true) {
            try {
                String zapis = "";

                StringBuilder stringBuilder = new StringBuilder(zapis);

                for (Skład e : Skład.listaSkładów){
                    List<Wagon> wagony = new ArrayList<>(e.wagony);
                    wagony.sort(new WagonComparator());
                    stringBuilder.append("Skład: ");
                    stringBuilder.append(e.lokomotywa.nazwa + " (");

                    for (Wagon w : wagony) {
                        stringBuilder.append("Wagon ID: " + w.ID + " masa: " + w.masa + ", ");
                    }
                    stringBuilder.append(")" + "\n");
                }

                zapis = stringBuilder.toString();
                plikDoZapisu.write(zapis);


                Thread.sleep(5000);

            } catch (InterruptedException exc) {
                return;
            }

        }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
