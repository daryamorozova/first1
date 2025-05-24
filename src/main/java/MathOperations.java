public class MathOperations {

    // метод
    public static void main(String[] args) {
        int sum1 = add(100, 2000);
        System.out.println("Сумма " + sum1);

        int sub1 = subtract(5, 2);
        System.out.println("Разность " + sub1);

        int mult1 = multiply(3, 3);
        System.out.println("Произведение " + mult1);

        double div1 = divide(3, 2);
        System.out.println("Частное " + div1);
    }

    public static int add(int x, int y) { //аргументы метода
        // тело метода
        return  x + y; // возвращаемое значение из метода
    }

    public static int subtract(int x, int y) { //аргументы метода
        // тело метода
        return  x - y; // возвращаемое значение из метода
    }

    public static int multiply(int x, int y) { //аргументы метода
        // тело метода
        return  x * y; // возвращаемое значение из метода
    }

    public static double divide(int x, int y) { //аргументы метода
        // тело метода
        return (double) x / y;
    }
}
