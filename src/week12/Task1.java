package week12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<Member> Jr = new ArrayList<>();
        List<Member> Jr1 = new ArrayList<>();
        Member James = new Member("James", 1961, "Male" );
        Member Hana = new Member("Hana", 1971, "Female");
        Member Ryan = new Member("Ryan" , 1999, "Male");
        Member Kai = new Member("Kai", 1992, "Male");
        Member Jenifer = new Member("Jenifer", 1992, "Female");
        Member Bryan = new Member("Bryan" , 2016, "Male");
        Member Avery = new Member("Avery" , 2018, "Female");
        Member Dylan = new Member("Dylan" , 2018, "Male");
        Member Angel = new Member("Angel" , 2016, "Female");
        Jr.add(Ryan);
        Jr.add(Kai);
        Jr1.add(Bryan);
        Jr1.add(Avery);
        Jr1.add(Dylan);
        Jr1.add(Angel);
        Parent grandMother = new Parent(Hana,Jr);
        Parent grandFather = new Parent(James,Jr);
        Parent father = new Parent(Kai,Jr1);
        Parent mother = new Parent(Jenifer,Jr1);
        System.out.println(father.getChild());

    }
}
abstract class Person{
    public abstract String getChild();
}
class Parent extends Person{
    Member member;
    private List<Member> person;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<Member> getPerson() {
        return person;
    }

    public void setPerson(List<Member> person) {
        this.person = person;
    }

    public Parent(Member member, List<Member> person) {
        this.member = member;
        this.person = person;
    }

    @Override
    public String getChild() {
        String s = new String();
        for (int i = 0 ; i < person.size() ; i++){
            s += person.get(i).getChild() + "  ";
        }
        return s;
    }
}
class Member extends Person{
    private String name;
    private int year;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member(String name, int year, String gender) {
        this.name = name;
        this.year = year;
        this.gender = gender;
    }

    @Override
    public String getChild() {
        return name;
    }
}