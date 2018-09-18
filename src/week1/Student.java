package Student;

public class Student {
    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;


    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public String getId(){
        return id;
    }
    public void setId(String n) {
        id = n;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String n) {
        group = n;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String n) {
        email = n;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Tran Hai Duong";
        id = "17020661";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name = s.name;
        id = s.id;
        email = s.email;
        group = s.group;
    }

    String getInfo() {
        // TODO:
        return "Ten: " + name + "\n" + "ID: " + id + "\n" + "Group: " + group + "\n" + "Email: " + email + "\n";
        //     return null; // xóa dòng này sau khi cài đặt
    }
}

