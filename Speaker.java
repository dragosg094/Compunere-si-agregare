package Compunere;

public class Speaker {

    private int maxVolume;
    private int crtVolume;

    public Speaker(int maxVolume, int crtVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = crtVolume;
    }

    public int getCrtVolume() {
        return crtVolume;
    }

    public void setCrtVolume(int crtVolume) {
        this.crtVolume = crtVolume;
    }

    public Speaker(int maxVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = maxVolume / 4;
    }

    public boolean increaseVolume() {
        if (crtVolume < maxVolume) {
            crtVolume++;
            return true;
        }
        return false;
    }

    public boolean decreaseVolume() {
        if (crtVolume > 0) {
            crtVolume--;
            return true;
        }
        return false;
    }

    public void setSilenceMode(){
        setCrtVolume(0);
    }
}
