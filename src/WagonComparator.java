import java.util.Comparator;

public class WagonComparator implements Comparator<Wagon> {


    @Override
    public int compare(Wagon o1, Wagon o2) {
        return (int) (o1.masa - o2.masa);
    }
}
