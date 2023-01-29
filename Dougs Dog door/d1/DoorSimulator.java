import java.util.Random;
public class DoorSimulator {
    public static void main(String args[]) {
        Random r = new Random();
        Door door = new Door();
        Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside ...");
        remote.pressButton();
        System.out.println("Fido has gone outside");
        System.out.println("Fidos all done ");
        if (r.nextBoolean()) { // alternate path door closes before dog enters
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {

            }
        }
        if (!door.isOpen()) {
            System.out.println("Dog is stuck and starts barking");
            System.out.println("Remote key is pressed");
            remote.pressButton();
        }
        System.out.println("Fido's back inside ..."); // main path

    }
}
