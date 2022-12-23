package ch07;

class MyTv {
    private boolean inPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 100;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 100;

    public void setChannel(int channelNum) {
        prevChannel = this.channel;
        channel = channelNum;
    }

    public void setVolume(int volumeNum) {
        volume = volumeNum;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}

public class ch07_연습문제2 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH : " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH : " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH : " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH : " + t.getChannel());
    }
}
