package Compunere;

public class Smartphone {
    private Pixel pixel = new Pixel();
    private Speaker speaker;
    private Microphone mic;
    private Screen screen;

    public Smartphone() {

        screen = new Screen(pixel, 40, 60, 10);
    }

    public Smartphone(int crtMicVol, int crtSpeakerVol) {
        speaker = new Speaker(100, crtSpeakerVol);
        mic = new Microphone(100, crtMicVol);
    }

    public void pressPowerButton() {

        System.out.println("class Smartphone: delegate to Case ->");
        Case.pressPowerButton();
    }


    public void pressVolumeUp() {

        System.out.println("class Smartphone: delegate to Case ->");
        Case.pressVolumeUp();
        speaker.increaseVolume();
    }

    public void pressVolumeDown() {

        System.out.println("class Smartphone: delegate to Case ->");
        Case.pressVolumeDown();
        speaker.decreaseVolume();
    }

    public void setPixel(int index, String color) {
        screen.setPixel(index, color);
    }

    public void colorScreen(String color) {
        screen.colorScreen(color);
    }

    public void increaseMicrophoneVolume() {
        mic.increaseVolume();
    }
    public void decreaseMicrophoneVolume(){
        mic.decreaseVolume();
    }
    public void muteMicrophone(){
        mic.muteMicrophone();
    }
    public void setSilenceMode(){
        speaker.setSilenceMode();
    }
}