package week5_6;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Shape;


public class Triangle1 extends Shape1 {
    private int x1,y1;
    private int x2,y2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }


    public Triangle1() {

    }

    public Triangle1(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Triangle1(Color color, int x, int y, int x1, int y1, int x2, int y2) {
        super(color, x, y);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    Shape draw() {
        Polygon triangle = new Polygon(x1,y1,x2,y2,super.getX(),super.getY());
        triangle.setFill(super.getColor());
        return triangle;
    }
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
