package Compunere;

import java.awt.*;

import java.util.ArrayList;

public class Screen {
    private ArrayList<Pixel> pixels = new ArrayList<>();

    private Dimensions dimensions;
    private Pixel pixel = new Pixel();
    public Screen(Pixel pixels, int  width,int height, int depth) {
        this.pixels.add(pixels);
        this.dimensions = new Dimensions( width, height, depth);
    }

    public void setPixel(int pixelIndex, String color){
        pixel.setPixel(color);
        pixels.set(pixelIndex,pixel) ;
    }
    public void colorScreen(String color){
        for(Pixel i : pixels){
            i.setPixel(color);
        }
    }
}