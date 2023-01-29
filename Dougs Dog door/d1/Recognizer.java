public class Recognizer {

    private Door door;

    Recognizer(Door door) {
        this.door = door;
    }

    public void onBark() {
        System.out.println("Recognizer recognized .....");
        door.open();
    }

}
