package week4.task2;

/**
 * Rectangle
 * -chiều dài
 * -chiều rộng
 * @see Shape
 */

public class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    /**
     * Constructor 1
     */
    public Rectangle() {
    }

    /**
     * Constructor 2
     * @param width
     * @param length
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor 3
     * @param color
     * @param filled
     * @param width
     * @param length
     */
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double getArea(){
        return width*length;
    }
    double getPerimeter(){
        return (width+length)*2;
    }
    /**
     * Trả về tất cả các giá trị của đối tượng
     * @return kiểu String ghi giá trị các thuộc tính
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
