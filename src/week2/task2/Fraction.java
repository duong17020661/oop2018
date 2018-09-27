package week2.task2;

import week2.task2.Task1;

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
    public Fraction(Objects obj){
        
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới

        int m = this.deno*other.deno;
        int t = this.nume*other.deno+this.deno*other.nume;
        int ucln = Task1.gcd(t,m);
        Fraction sum = new Fraction(t/ucln,m/ucln);

        return sum;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int m = this.deno*other.deno;
        int t = this.nume*other.deno-this.deno*other.nume;
        int ucln = Task1.gcd(t,m);
        Fraction subtract = new Fraction(t/ucln,m/ucln);

        return subtract;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int m = this.deno*other.deno;
        int t = this.nume*other.nume;
        int ucln = Task1.gcd(t,m);
        Fraction mul = new Fraction(t/ucln,m/ucln);

        return mul;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int m = this.deno*other.nume;
        int t = this.nume*other.deno;
        int ucln = Task1.gcd(t,m);
        Fraction div = new Fraction(t/ucln,m/ucln);

        return div;
    }
    public boolean equals(Object obj){
        Fraction ps = (Fraction)obj;
        float x = (float)this.nume/this.deno;
        float y = (float)ps.nume/ps.deno;
        if(x==y) return true;
        else return false;
       
    }

    public static void main(String[] args) {

        Fraction ps1 = new Fraction(1,2);
        Fraction ps2 = new Fraction(2,4);
        Fraction sum = ps1.add(ps2);
        System.out.println(sum.nume + "/" + sum.deno);
        Fraction sub = ps1.subtract(ps2);
        System.out.println(sub.nume + "/" + sub.deno);
        Fraction mul = ps1.multiply(ps2);
        System.out.println(mul.nume + "/" + mul.deno);
        Fraction div = ps1.divide(ps2);
        System.out.println(div.nume + "/" + div.deno);
        System.out.println(ps1.equals(ps2));
    }
}

