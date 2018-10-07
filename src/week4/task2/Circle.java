package week4.task2;

/**
 * Circle
 * -bán kính
 * -số PI
 * @see Shape
 */

public class Circle extends Shape {
    double radius = 1.0;
    double PI = 3.14;

    /**
     * Constructor 1
     */
    public Circle() {
    }

    /**
     * Constructor 2
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor 3
     * @param color
     * @param filled
     * @param radius
     */
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    /**
     * Diện tích hình tròn
     * @return giá trị diện tích
     */
    double getArea(){
        return PI*radius*radius;
    }

    /**
     * Chu vi hình tròn
     * @return  giá trị chu vi
     */
    double getPerimeter(){
        return 2*radius*PI;
    }
    /**
     * Trả về tất cả các giá trị của đối tượng
     * @return kiểu String ghi giá trị các thuộc tính
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}
