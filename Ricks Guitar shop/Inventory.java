import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {

    ArrayList<Guitar> guitars = new ArrayList<>();
    ArrayList<Mandolin> mandolins = new ArrayList<>();

    public void addGuitar(Guitar g) {
        guitars.add(g);
    }

    public void addMandolin(Mandolin m) {
        mandolins.add(m);
    }

    public Guitar getGuitar(String sn) {
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); i.next()) {
            Guitar g = (Guitar) i.next();
            if (g.getSerialNumber() == sn)
                return g;
        }
        return null;
    }

    public Mandolin getMandolin(String sn) {
        for (Iterator<Mandolin> i = mandolins.iterator(); i.hasNext(); i.next()) {
            Mandolin m = (Mandolin) i.next();
            if (m.getSerialNumber() == sn)
                return m;
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

    public ArrayList<Mandolin> search(MandolinSpec spec) {
        ArrayList<Mandolin> searchList = new ArrayList<>();

        for (Iterator<Mandolin> i = mandolins.iterator(); i.hasNext();) {
            Mandolin g = (Mandolin) i.next();
            MandolinSpec gspec = g.getSpec();
            if (gspec.compare(spec))
                searchList.add(g);
        }

        return searchList;

    }
}
