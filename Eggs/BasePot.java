import java.util.Calendar;
import java.util.Date;

public abstract class BasePot {
    Calendar nowTime = Calendar.getInstance();
    Calendar targetTime = Calendar.getInstance();
    String statusOfEggs = "Not cooked yet";
    static final long ONE_MINUTE_IN_MILLIS=60000;

    public void startBoiling(int minutes){
        long t =  nowTime.getTimeInMillis();
        Date before =new Date();
        Date afterAddingMins =new Date(t + (minutes * ONE_MINUTE_IN_MILLIS));

        while (before.getMinutes() != afterAddingMins.getMinutes()) {
            nowTime.setTime(new Date());
        }
    }

    public void GetCurrentStatus(){
        System.out.println(this.statusOfEggs);
    }
}
