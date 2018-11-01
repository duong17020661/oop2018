package week7.task1;

public class Multiplication extends BinaryExpression {
    Expression left;
    Expression right;
    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString()+ "*" + right.toString();
    }

    @Override
    public int evaluate() {
        return left().evaluate() * right().evaluate();
    }
}
