package week4.task1;

/**
 * Quả Táo
 * -Giá bán
 * -Số lượng
 * @see HoaQua
 */

public class Tao extends HoaQua {

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
     * Tính giá mua táo
     * @return trả về kiểu int chỉ số tiền phải trả
     */
    int cost(){
        return price*amount;
    }

    /**
     * Xác định loại táo
     * @return xâu ký tự ghi tên loại
     */
    String Type(){
        if(price==50) return "Táo đỏ";
        else if(price==40) return "Táo xanh";
        else return "Không có loại táo đấy";
    }
}
