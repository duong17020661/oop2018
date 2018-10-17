package week5_6;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.awt.*;

public class Rectangle1 extends Shape1 {
    private int w;
    private int l;

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public Rectangle1() {
    }

    public Rectangle1(int w, int l) {
        this.w = w;
        this.l = l;
    }

    public Rectangle1(Color color, int x, int y, int w, int l) {
        super(color, x, y);
        this.w = w;
        this.l = l;
    }

    @Override
    Shape draw() {
        Rectangle rectangle = new Rectangle(super.getX(), super.getY(), getW(), getL());
        rectangle.setFill(super.getColor());
        return rectangle;
    }
    @Override
    Polyline move() {
        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(new Double[]{
                (double)super.getX(),(double)super.getY(),
                100.0,250.0,
                500.0,500.0,
        });
        return polyline;
    }
}
