package week5_6;


import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Shape;

public abstract class Shape1{
    private Color color = Color.YELLOW;
    private int x = 50;
    private int y = 50;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape1() {
    }

    public Shape1(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    abstract Shape draw();
    abstract Polyline move();
}
