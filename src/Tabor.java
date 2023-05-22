public abstract class Tabor {


    static int nextID = 1;
    final int ID;
    Tabor() {
        ID = nextID;
        ++nextID;
    }


}
