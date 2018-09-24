package week2.task2;

import week2.task1;

import java.util.Scanner;

public class Fraction {
    private int nume;
    private int deno;

    public int getDeno() {
        return deno;
    }

    public void setDeno(int deno) {
        this.deno = deno;
    }

    public int getNume() {
        return nume;
    }

    public void setNume(int nume) {
        this.nume = nume;
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.nume=numerator;
        this.deno=denominator;
    }

    public week2.Fraction add(week2.Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới

        int m = this.deno*other.deno;
        int t = this.nume*other.deno+this.deno*other.nume;
        int ucln = task1.gcd(t,m);
        week2.Fraction sum = new week2.Fraction(t/ucln,m/ucln);

        return sum;
    }

    public week2.Fraction subtract(week2.Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int m = this.deno*other.deno;
        int t = this.nume*other.deno-this.deno*other.nume;
        int ucln = task1.gcd(t,m);
        week2.Fraction subtract = new week2.Fraction(t/ucln,m/ucln);

        return subtract;
    }

    public week2.Fraction multiply(week2.Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int m = this.deno*other.deno;
        int t = this.nume*other.nume;
        int ucln = task1.gcd(t,m);
        week2.Fraction mul = new week2.Fraction(t/ucln,m/ucln);

        return mul;
    }

    public week2.Fraction divide(week2.Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int m = this.deno*other.nume;
        int t = this.nume*other.deno;
        int ucln = task1.gcd(t,m);
        week2.Fraction div = new week2.Fraction(t/ucln,m/ucln);

        return div;
    }
    public boolean equals(week2.Fraction ps){
        float x = (float)this.nume/this.deno;
        float y = (float)ps.nume/ps.deno;
        if(x==y) return true;
        else return false;
    }

    public static void main(String[] args) {

        week2.Fraction ps1 = new week2.Fraction(2,4);
        week2.Fraction ps2 = new week2.Fraction(2,4);
        week2.Fraction sum = ps1.add(ps2);
        System.out.println(sum.nume + "/" + sum.deno);
        week2.Fraction sub = ps1.subtract(ps2);
        System.out.println(sub.nume + "/" + sub.deno);
        week2.Fraction mul = ps1.multiply(ps2);
        System.out.println(mul.nume + "/" + mul.deno);
        week2.Fraction div = ps1.divide(ps2);
        System.out.println(div.nume + "/" + div.deno);
        System.out.println(ps1.equals(ps2));
    }
}

