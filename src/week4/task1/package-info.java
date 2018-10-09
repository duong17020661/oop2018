/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;

    class Main{
        public static void main(String[] args) {
            HoaQua hoaQua = new HoaQua("Xanh", 10);
            Cam cam = new Cam("Cam", 10,20, 100);
            Tao tao = new Tao("Do", 10,30,500);
            CamCaoPhong caoPhong = new CamCaoPhong("Cam", 12, 50, 1000, "Viet Nam", 10);
            CamSanh sanh = new CamSanh("Xanh", 11,60,450,"Viet Nam",30);
            System.out.println(cam.getAmount());
        }
        }