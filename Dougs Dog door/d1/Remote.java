public class Remote {
    private Door door;

    Remote(Door door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Remote button pressed");
        if (door.isOpen())
            door.close();
        else {
            door.open();
        }
    }

}
