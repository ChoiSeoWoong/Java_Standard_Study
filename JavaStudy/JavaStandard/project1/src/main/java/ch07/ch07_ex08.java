package ch07;

class Time {
    private int hour;
    private int minute;
    private int second;
    // 접근 제어자를 private로 하여 외부에서 직접 접근하지 못하도록 한다.

    // get, set 메서드를 통해 변수에 대한 간접 접근 허용
    public int getHour() {return hour;}

    public void setHour(int hour) {
        if(hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute() {return minute;}

    public void setMinute(int minute) {
        if(minute < 0 || minute > 59) return;
        this.minute = minute;
    }

    public int getSecond() {return second;}

    public void setSecond(int second) {
        if(second < 0 || second > 59) return;
        this.second = second;
    }
}
public class ch07_ex08 {
    public static void main(String[] args) {
        Time t = new Time();
        //t.hour = 25;
        t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(100);
        System.out.println(t.getHour());
    }
}
