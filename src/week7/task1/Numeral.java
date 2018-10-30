package week7.task1;

public class Numeral extends Expression{
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Numeral() {
    }

    public Numeral(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
