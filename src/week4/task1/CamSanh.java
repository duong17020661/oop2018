package week4.task1;

/**
 * Cam sành
 * -Xuất xứ
 * -Đã nhập bao nhiêu ngày
 * @see Cam
 */

public class CamSanh extends Cam {
    String origin;
    int date;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    /**
     * Constructor
     * @param color
     * @param size
     * @param price
     * @param amount
     * @param origin
     * @param date
     */
    public CamSanh(String color, int size, int price, int amount, String origin, int date) {
        super(color, size, price, amount);
        this.origin = origin;
        this.date = date;
    }

    /**
     * Xem giá bán có đúng với giá thị trường hay không
     * @return trả về true nếu giá đúng với giá thị trường ngược lại trả về false
     */

    boolean Sanh(){
        if(getPrice()==50) return true;
        else return false;
    }

    /**
     * Xem Cam đã hỏng hay chưa
     * @return  Trả về ký tự ghi trạng thái quả cam
     */
    String limit(){
        if(date>100) return "Đã hỏng";
        else return "Còn dùng được";
    }
}
