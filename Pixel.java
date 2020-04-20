package Compunere;

public class Pixel {

    private String color;

    public Pixel() {

        color = "#FFFFFF";
    }
    public Pixel(String color) {

        this.color = color;
    }

    public void setPixel(String color){
        this.color = color;
    }
}
