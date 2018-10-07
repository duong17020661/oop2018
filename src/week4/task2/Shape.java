package week4.task2;

/**
 * Shape
 * -màu sắc
 * -thỏa mãn
 * @author Trần Hải Dương
 */

public class Shape {
    String color = "red";
    boolean filled = true;

    /**
     * Constructor 1
     */
    public Shape() {
    }

    /**
     * Constructor 2
     * @param color
     * @param filled
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Trả về tất cả các giá trị của đối tượng
     * @return kiểu String ghi giá trị các thuộc tính
     */
    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
