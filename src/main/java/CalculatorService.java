public class CalculatorService {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
