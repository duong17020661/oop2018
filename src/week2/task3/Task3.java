package week2.task3;

public class Task3 {
    public static void main(String[] args) {

        // Cầu thủ

        Kicker[] p = new Kicker[5];
        Kicker p1 = new Kicker("Ozil", "29", "Germany", "Arsenal");
        Kicker p2 = new Kicker("Torreira", "22", "Uruguay", "Arsenal");
        Kicker p3 = new Kicker("Aubameyang", "29", "Gabon", "Arsenal");
        Kicker p4 = new Kicker("Pele", "77", "Brazil", "Retired");
        Kicker p5 = new Kicker("Maradona", "57", "Argentina", "Retired");

        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        p[3] = p4;
        p[4] = p5;
        p1.kickerInfo(); // thông tin cầu thủ
        System.out.println("\n");

        if(p1.retired())
            System.out.println( p1.getName() + " Retired"); // giải nghệ rồi
        else System.out.println(p1.getName() + " Is playing"); // hay đang thi đấu
        System.out.println("\n");

        System.out.println("Arsenal player:"); // In ra các cầu thủ của Arsenal
        for (int i = 0; i < p.length; i++) {
            p[i].Arsenal();
        }
        System.out.println("\n");

        // Trường học của tôi

        mySchool s1 = new mySchool("Ba Dinh", "Thanh Hoa", "Primary School", 1);
        mySchool s2 = new mySchool("Le Quy Don", "Thanh Hoa", "Secondary School", 3);
        mySchool s3 = new mySchool("Bim Son", "Thanh Hoa", "High School", 1);
        mySchool s4 = new mySchool("UET", "Ha Noi", "University", 10);

        s1.schoolInfo(); // thông tin trường học
        System.out.println("\n");

        s4.transport(); // phương tiện đi lại
        System.out.println("\n");

        if(s3.atmyHometown()) System.out.println(s3.getName() + " At my hometown"); // ở quê tôi
        else System.out.println(s3.getName() + " Not in my hometown"); // hay ở chõ khác
        System.out.println("\n");
        // Bạn bè

        Friends[] f = new Friends[6];
        Friends f1 = new Friends("Tien Thanh", "19", "Thanh Hoa", "Male");
        Friends f2 = new Friends("Manh Hung", "21", "Thanh Hoa", "Male");
        Friends f3 = new Friends("Thanh Tung", "17", "Thanh Hoa", "Male");
        Friends f4 = new Friends("Viet Cuong", "19", "Hung Yen", "Male");
        Friends f5 = new Friends("Dang Quynh", "19", "Thanh Hoa", "Female");
        Friends f6 = new Friends("Chau Anh", "19", "Thanh Hoa", "Female");

        f[0] = f1;
        f[1] = f2;
        f[2] = f3;
        f[3] = f4;
        f[4] = f5;
        f[5] = f6;

        f1.friendsInfo(); // Thông tin bạn
        System.out.println("\n");

        if(f2.friend()) System.out.println(f2.getName() + " Classmate"); // bạn cùng lớp
        else System.out.println(f2.getName() + " Neighbor"); // hay hàng xóm
        System.out.println("\n");

        System.out.println("Male:");
        for(int i=0;i<f.length;i++){
            f[i].male(); // Danh sách ban nam;
        }
        System.out.println("\n");

        System.out.println("Female:");
        for(int i=0;i<f.length;i++){
            f[i].female(); // Danh sách bạn nữ;
        }

        System.out.println("\n");
        if(f4.sameHome()) System.out.println(f4.getName() + " Same home"); // cùng quê
        else System.out.println(f4.getName() + " Different home"); // hay khác quê

    }
}
class Kicker{
    private String name;
    private String age;
    private String national;
    private String clb;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClb()  {
        return clb;
    }

    public void setClb(String clb)  {
        this.clb = clb;
    }



    Kicker(String name, String age, String national, String clb) {
        // TODO:
        this.name = name;
        this.national = national;
        this.age = age;
        this.clb = clb;
    }
    void kickerInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("National: " + national);
        System.out.println("CLB: " + clb);
    }
    boolean retired(){
        return clb.equals("Retired");
    }
    void Arsenal(){
        if(clb.equals("Arsenal"))
            System.out.println(name);
    }
}
class mySchool{
    private String name; // đã từng học ở đó hay chưa
    private String place; // ở Hà Nội hay k
    private String type; // là trường cấp 3 hay đại học
    private int distance;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance(){
        return distance;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }

    mySchool(String name, String place, String type, int distance) {
        // TODO:
        this.name = name;
        this.place = place;
        this.type = type;
        this.distance = distance;
    }
    void schoolInfo(){
        System.out.println("Name: " + name);
        System.out.println("Place: " + place);
        System.out.println("Type: " + type);
        System.out.println("Distance: " + distance + "km");
    }
    boolean atmyHometown(){
        return place.equals("Thanh Hoa");
    }
    void transport(){
        if( distance <= 2 ) System.out.println("Walk to school");
        else if( distance > 2 && distance <=5 ) System.out.println("Go to school by bike");
        else System.out.println("Go to school by bus");
    }


}
class Friends{
    private String name;
    private String age; // bạn cùng lớp hay bạn từ nhỏ
    private String place; // cùng quê hay khác quê
    private String gender; // là nam hay nữ

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    Friends(String name, String age, String place, String gender) {
        // TODO:
        this.name = name;
        this.place = place;
        this.age = age;
        this.gender = gender;
    }
    void friendsInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Home: " + place);
    }

    boolean friend(){
        return age.equals("19");
    }

    void male(){
        if(gender.equals("Male"))
            System.out.println(name);
    }

    void female(){
        if(gender.equals("Female"))
            System.out.println(name);
    }
    boolean sameHome(){
        return place.equals("Thanh Hoa");
    }



}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
