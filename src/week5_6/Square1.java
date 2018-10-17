package week5_6;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Shape;

import java.awt.*;

public class Square1 extends Rectangle1 {

    public int getSide(){
        return getW();
    }
    public void setSide(int side){
        setW(side);
    }

    public Square1() {
    }

    public Square1(int side) {
        super(side, side);
    }

    public Square1(Color color, int x, int y, int side) {
        super(color, x, y, side, side);
    }

    @Override
    Shape draw() {
        return super.draw();
    }
    @Override
    Polyline move() {
        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(new Double[]{
                (double)getX(),(double)getY(),
                150.0,350.0,
                60.0,400.0,
        });
        return polyline;
    }
}
