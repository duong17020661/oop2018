package Student;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public static Student[] student = new Student[3];

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.getGroup().equals(s2.getGroup()));

        //      return false; // xóa dòng này sau khi cài đặt
    }

    static void studentsByGroup() {
        // TODO:
        System.out.println("\n"+"Danh sach sinh vien lop INT22041:" );
        for(int i=0;i<student.length;i++){
            if(student[i].getGroup().equals("INT22041")) {
                System.out.println(student[i].getInfo());
            }
            if(student[i].getGroup()==null) {
                break;
            }
        }
    }

    static void removeStudent(String id) {
        // TODO:
        int c=0;
        for(int i=0;i<student.length;i++){
            if(!student[i].getId().equals(id)) {
                student[c]=student[i];
                c++;
            }
        }
        for(int i=0;i<c;i++){
            System.out.println(student[i].getInfo());
        }
    }

    public static void main(String[] args) {
        // TODO:
        System.out.println("Test 1-6:");
        Student s = new Student();
        s.setName("Tran Hai Duong");
        s.setId("17020661");
        s.setGroup("INT22042");
        s.setEmail("uet@vnu.edu.vn");
        System.out.println(s.getInfo());

        System.out.println("\n"+"Test 7-8:" + "\n");
        Student s1 = new Student();
        System.out.println(s1.getInfo());

        Student s2 = new Student("Duong", "17020000", "gmail@vnu.edu.vn");
        System.out.println(s2.getInfo());

        Student s3 = new Student(s);
        System.out.println(s3.getInfo());

        System.out.println("\n"+"Test 8-10:");

        if(sameGroup(s1,s3)) System.out.println("Cung lop");
        else System.out.println("Khac lop");

        System.out.println("\n"+"Test 11-12:");


        student[0]=s1;
        student[1]=s2;
        student[2]=s3;
//        for(int i=0;i<student.length;i++) {
//            System.out.println(student[i].getName());
//        }
        System.out.println("Test");
        studentsByGroup();
        System.out.println("\n"+"Test 13:");
        removeStudent("17020000");



    }
}


