package week4.task1;

/**
 * Cam Cao Phong
 * -Xuất Xứ
 * -Đã nhập đc bao nhiêu ngày
 * @see Cam
 */

public class CamCaoPhong extends Cam {
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
     * Contructor
     * @param color
     * @param size
     * @param price
     * @param amount
     * @param origin
     * @param date
     */
    public CamCaoPhong(String color, int size, int price, int amount, String origin, int date) {
        super(color, size, price, amount);
        this.origin = origin;
        this.date = date;
    }

    /**
     * Xem giá bán có đúng với giá thị trường hay không
     * @return trả về true nếu giá đúng với giá thị trường ngược lại trả về false
     */

    boolean Caophong(){
        if(getPrice()==60) return true;
        else return false;
    }
    /**
     * Xem Cam đã hỏng hay chưa
     * @return  Trả về ký tự ghi trạng thái quả cam
     */
    String limit(){
        if(date>150) return "Đã hỏng";
        else return "Còn dùng được";
    }
}
