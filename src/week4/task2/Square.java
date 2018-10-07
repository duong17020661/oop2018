package week4.task2;

/**
 * Square
 * -cạnh
 * @see Rectangle
 */

public class Square extends Rectangle {

    /**
     * Constructor 1
     */
    public Square() {
    }

    /**
     * Constructor 2
     * @param side
     * @param side
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor 3
     * @param color
     * @param filled
     * @param side
     * @param side
     */
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setWidth(double side){
        side = getWidth();
    }
    public void setLength(double side){
        setLength(side);
    }

    /**
     * Trả về tất cả các giá trị của đối tượng
     *
     * @return kiểu String ghi giá trị các thuộc tính
     */
    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
