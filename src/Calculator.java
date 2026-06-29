public class Calculator {

    public double add(double left, double right) {
        return left + right;
    }

    public double subtract(double left, double right) {
        return left - right;
    }

    public double multiply(double left, double right) {
        return left * right;
    }

    public double divide(double left, double right) {
        if (right == 0.0d) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }

        return left / right;
    }
}