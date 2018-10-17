package week5_6;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Shape;

import java.awt.*;

public class Circle1 extends Shape1 {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle1() {
    }

    public Circle1(int r) {
        this.r = r;
    }

    public Circle1(Color color, int x, int y, int r) {
        super(color, x, y);
        this.r = r;
    }

    @Override
    Shape draw() {
        Circle circle = new Circle(super.getX(),super.getY(),getR());
        circle.setFill(super.getColor());
        return circle;
    }
    @Override
    Polyline move() {
        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(new Double[]{
                (double)getX(),(double)getY(),
                180.0,150.0,
                360.0,240.0,
        });
        return polyline;
    }
}
