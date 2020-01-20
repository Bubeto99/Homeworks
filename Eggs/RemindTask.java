import java.util.TimerTask;

class RemindTask extends TimerTask {
    public void run() {
        System.out.println("Time's up!");
        System.exit(0);
    }
}
