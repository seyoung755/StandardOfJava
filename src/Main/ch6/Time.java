package Main.ch6;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        if (0 > hour || hour > 23) {
            return;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (0 > minute || minute > 59) {
            return;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (0 > second || second > 59) {
            return;
        }
        this.second = second;
    }

    public static int getTimeGapInMin(Time A, Time B) {
        if (A.hour > B.hour) {
            return 60 * (A.hour - B.hour) + (A.minute - B.minute);
        } else {
            return 60 * (B.hour - A.hour) + (B.minute - A.minute);
        }
    }

    public static void main(String[] args) {
        Time A = new Time();
        Time B = new Time();

        A.setHour(8);
        A.setMinute(30);
        B.setHour(3);
        B.setMinute(45);
        System.out.println(getTimeGapInMin(A, B));
    }
}
