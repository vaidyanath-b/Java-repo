import java.util.List;
import java.util.Scanner;

public class RickShop {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        System.out.println("Rick's Guitar Shop Inventory:");
        
        List<Guitar> gl = inventory
                .search(new GuitarSpec(Builder.MARTIN, "OM-28", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD,
                        Wood.ADIRONDACK, NumStrings.TWELVE));
        if (gl.size() > 0) {
            System.out.println("You might like these guitars:");
            for (Guitar g : gl) {
                System.out.println(g.getSpec().builder + " " + g.getSpec().model + " " + g.getSpec().type + " "
                        + g.getSpec().numStrings + " " + g.getSpec().topWood + " " + g.getSpec().backWood);
                System.out.println("Price: $" + g.getPrice());
            }
        } else
            System.out.println("No guitars found");

    }

    public static void initializeInventory(Inventory inventory) {
        Guitar g;
        g = new Guitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
                Wood.ALDER, NumStrings.TWELVE));
        inventory.addGuitar(g);
        g = new Guitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
                Wood.ALDER, NumStrings.TWELVE));
        inventory.addGuitar(g);
        g = new Guitar("122784", 5495.95, new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, Wood.MAHOGANY,
                Wood.ADIRONDACK, NumStrings.TWELVE));
        inventory.addGuitar(g);
        g = new Guitar("76531", 6295.95, new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD,
                Wood.ADIRONDACK, NumStrings.TWELVE));
        inventory.addGuitar(g);
        g = new Guitar("70108276", 2295.95, new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, Wood.MAHOGANY,
                Wood.MAHOGANY, NumStrings.TWELVE));
        inventory.addGuitar(g);
        g = new Guitar("82765501", 1890.95, new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC,
                Wood.MAHOGANY, Wood.MAHOGANY, NumStrings.TWELVE));
        inventory.addGuitar(g);
        g = new Guitar("77023", 6275.95, new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD,
                Wood.ADIRONDACK, NumStrings.TWELVE));
        inventory.addGuitar(g);
        g = new Guitar("1092", 12995.95, new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD,
                Wood.CEDAR, NumStrings.TWELVE));
        inventory.addGuitar(g);
        g = new Guitar("566-62", 8999.95,
                new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, Wood.COCOBOLO, Wood.CEDAR, NumStrings.TWELVE));
        inventory.addGuitar(g);
    }

}
