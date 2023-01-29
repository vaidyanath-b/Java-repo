import java.util.Random;
//problem - if we want to pass a time interval to close the door after opening , how to do - / prop drilling?
public class DoorSimulator {
    public static void main(String args[]) {
        Random r = new Random();
        Door door = new Door();
        Remote remote = new Remote(door);
        Recognizer recognizer = new Recognizer(door);
        System.out.println("Fido barks to go outside ...");
        if (r.nextBoolean()) {
            recognizer.onBark();
        } else {
            remote.pressButton();
        }
        System.out.println("Fido has gone outside");
        System.out.println("Fidos all done ");
        if (r.nextBoolean()) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {

            }
        }
        if (!door.isOpen()) {
            System.out.println("Dog is stuck and starts barking");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            if (r.nextBoolean())
                recognizer.onBark();

            else
                remote.pressButton();
        }
        System.out.println("Fido's back inside ...");

    }
}
