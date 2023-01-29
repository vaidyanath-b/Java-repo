public class Door {

    private boolean open = false;

    public void close() {
        if (open) {
            System.out.println("Door closing ...");
            open = false;
        }
    }

    public void open() {
        if (!open) {
            System.out.println("Door opening....");
            open = true;
        }
    }

    public boolean isOpen() {
        return open;
    }

}