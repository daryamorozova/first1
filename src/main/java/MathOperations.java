public class MathOperations {


    public static void main(String[] args) {
        int sum1 = add(2, 6);
        System.out.println("1.1. Сумма " + sum1);

        int sub1 = subtract(5, 10);
        System.out.println("1.2. Разность " + sub1);

        int mult1 = multiply(5, 10);
        System.out.println("1.3. Произведение " + mult1);

        double div1 = divide(6, 4);
        System.out.println("1.4. Частное " + div1);

        int max1 = findMax(0, -3);
        System.out.println("2. Максимум среди двух чисел " + max1);

        int diff1 = difference(3, 12);
        System.out.println("3. Модуль разницы двух чисел " + diff1);

        int sq1 = squareArea(4);
        System.out.println("4.1. Площадь квадрата " + sq1);

        int per1 = squarePerimeter(3);
        System.out.println("4.2. Периметр квадрата " + per1);

        double min1 = convertSecondsToMinutes(610);
        System.out.println("5. Минуты " + min1);

        double avg1 = averageSpeed(50, 0);
        System.out.println("6.1. " + avg1);

        double avg2 = averageSpeed(50, 20);
        System.out.println("6.2. Средняя скорость " + avg2);

        double hup1 = findHypotenuse(3, 4);
        System.out.println("7.1. Гипотенуза " + hup1);

        double hup2 = findHypotenuse(2, 2);
        System.out.println("7.2. Гипотенуза " + hup2);

        double cir1 = circleCircumference(2.5);
        System.out.println("8.1. Длина окружность " + cir1);

        double cir2 = circleCircumference(10);
        System.out.println("8.2. Длина окружность " + cir2);

        double pers1 = calculatePercentage(200, 25);
        System.out.println("9. Вычисление процентов " + pers1);

        double far1 = celsiusToFahrenheit(37);
        System.out.println("10.1. Градусы Цельсия в Фаренгейты " + far1);

        double cel1 = fahrenheitToCelsius(80);
        System.out.println("10.2. Фаренгейты в градусы Цельсия " + cel1);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        if (time > 0) {
            return (double) distance / time;
        } else {
            System.out.println("Время должно быть больше нуля");
            return Double.NaN;
        }
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        if (total != 0) {
            return (part * 100) / total;
        } else {
            System.out.println("Общее не должно быть равно нулю");
            return 0;
        }

    }

    public static double celsiusToFahrenheit(double c) {
        return (double) (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (double) ((f - 32) * 5 / 9);
    }
}
