package ch07;

class Tv {
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}

}

class SmartTv extends Tv { // SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
    boolean caption; // 자막 여부
    void displayCaption(String text) {
        if(caption)
            System.out.println(text);
    }
}

public class ch07_ex01 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Hello world!");
        stv.caption = true;
        stv.displayCaption("Hello world!");
    }
}
