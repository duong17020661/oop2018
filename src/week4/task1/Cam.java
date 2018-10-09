package week4.task1;

/**
 * Quả cam
 * -giá bán
 * -số lượng
 * @see HoaQua
 */

public class Cam extends HoaQua {
    private int price;
    private int amount;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Contructor
     * @param color
     * @param size
     * @param price
     * @param amount
     */
    public Cam(String color, int size, int price, int amount) {
        super(color, size);
        this.price = price;
        this.amount = amount;
    }

    /**
     * Tính giá mua cam
     * @return trả về kiểu int chỉ số tiền phải trả
     */
    int cost(){
        return price*amount;
    }

    /**
     * Xác định loại cam
     * @return  trả về xâu ký tự ghi tên loại cam
     */
    String Type(){
        if(price==50) return "Cam cao phong";
        else if(price==40) return "Cam sành";
        else return "Không có loại cam đấy";
    }
}
