package week4.task1;

/**
 * Hoa quả
 * -màu sắc
 * -kích cỡ
 * @author Trần Hải Dương
 */

public class HoaQua{

    private String color;
    private int size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Constructor
     * @param color
     * @param size
     */
    public HoaQua(String color, int size) {
        this.color = color;
        this.size = size;
    }

    /**
     *  Xác định xem nó có phải Cam hay không
     * @return Trả về true nếu là quả cam, false nếu không phải
     */

    boolean QuaCam(){
        if(color.equals("cam")) return true;
        else return false;
    }

    /**
     *  Xác định trạng thái quả
     * @return Trả về xâu ký tự ghi trạng thái của hoa quả
     */
    String XanhChin(){
        if(size>=10) return "Đã chín";
        else if (size>=5&&size<10) return "Có thể hái";
        else return "Đang còn xanh";
    }
}
