import java.util.Timer;
import java.util.TimerTask; 
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
            final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    close();
                    timer.cancel();
                }
            }, 5000);
        }
    }

    public boolean isOpen() {
        return open;
    }

}