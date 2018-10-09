/**
 * Package bài làm cho Câu 2
 * TODO: Khai báo các class, thuộc tính và phương thức như biểu đồ lớp của Câu 2. 1 file chỉ khai báo 1 class
 * TODO: Viết comment và khai báo getter, setter đầy đủ như yêu cầu ở Câu 1
 * TODO: Sử dụng số PI tự định nghĩa dùng cho các phương thức getArea() và getPerimeter()
 * @author cuong
 * @version 0.1
 */
package week4.task2;
    class Main {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle(3,4);
        Rectangle c = new Rectangle("blue", true, 3,6 );
        System.out.println(a.getArea());
        System.out.println(b.getPerimeter());
        System.out.println(c.getColor());
        Circle circle = new Circle();
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle("red",true,6);
        System.out.println(circle.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle2.getRadius());
        Square square = new Square();
        Square square1 = new Square(2);
        Square square2 = new Square("yellow", true, 5);
        System.out.println(square.getArea());
        System.out.println(square1.getPerimeter());
        System.out.println(square2.getWidth());
        System.out.println(square1.getLength());
    }
}