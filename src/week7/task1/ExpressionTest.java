package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression n1 = new Numeral(10);
        Expression s1 = new Square(n1);
        Expression n2 = new Numeral(-1);
        Expression n3 = new Numeral(6);
        Expression a1 = new Addition(s1, n2);
        Expression a2 = new Addition(a1, n3);
        Expression s2 = new Square(a2);
        Expression n4 = new Numeral(0);
        Expression d1 = new Division(s2,n4);
        System.out.println(s2.toString());
        try {
            System.out.println(d1.evaluate());
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println(s2.evaluate());
    }
}
