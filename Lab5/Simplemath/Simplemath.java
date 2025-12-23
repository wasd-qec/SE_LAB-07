package Lab5.Simplemath;

public class Simplemath {

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
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (a == 0 && b == 0) {
            throw new ArithmeticException("0 divided by 0 is undefined");
        }
        return a / b;
    }
}
    