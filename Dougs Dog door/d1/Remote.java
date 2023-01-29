import java.util.Timer;
import java.util.TimerTask;

public class Remote {
    private Door door;

    Remote(Door door) {
        this.door = door;
    }

    public void pressButton() {
        if (door.isOpen())
            door.close();
        else {
            door.open();
            final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    door.close();
                    timer.cancel();
                }
            }, 5000);
        }

    }

}
