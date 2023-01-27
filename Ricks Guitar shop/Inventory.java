import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {

    ArrayList<Guitar> guitars = new ArrayList<>();

    public void addGuitar(Guitar g) {
        guitars.add(g);
    }

    public Guitar getGuitar(String sn) {
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); i.next()) {
            Guitar g = (Guitar) i.next();
            if (g.getSerialNumber() == sn)
                return g;
        }
        return null;
    }

    public ArrayList<Guitar> search(GuitarSpec spec) {
        ArrayList<Guitar> searchList = new ArrayList<>();

        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar g = (Guitar) i.next();
            GuitarSpec gspec = g.getSpec();
            if (gspec.compare(spec))
                searchList.add(g);
        }

        return searchList;

    }
}
