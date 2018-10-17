package week5_6;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Shape;

public class Hexagon extends Shape1{


    public Hexagon() {
    }

    public Hexagon(Color color, int x, int y) {
        super(color, x, y);
    }

    @Override
    Shape draw() {
        Polygon polygon = new Polygon();

        //Adding coordinates to the polygon
        polygon.getPoints().addAll(new Double[]{
                200.0, 50.0,
                400.0, 50.0,
                450.0, 150.0,
                400.0, 250.0,
                200.0, 250.0,
                150.0, 150.0,
        });
        polygon.setFill(super.getColor());
        return polygon;
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
