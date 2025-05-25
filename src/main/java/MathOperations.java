import static java.lang.Math.abs;

public class MathOperations {

    // метод
    public static void main(String[] args) {
        int sum1 = add(100, 2000);
        System.out.println("1.1 Сумма " + sum1);

        int sub1 = subtract(5, 2);
        System.out.println("1.2 Разность " + sub1);

        int mult1 = multiply(3, 3);
        System.out.println("1.3 Произведение " + mult1);

        double div1 = divide(3, 2);
        System.out.println("1.4 Частное " + div1);

        int max1 = findMax(-7, 2);
        System.out.println("2. Максимум " + max1);

        int diff1 = difference(3, 10);
        System.out.println("3. Модуль разности " + diff1);

        int sqare1 = squareArea(3);
        System.out.println("4.1. Площадь квадрата " + sqare1);

        int perim1 = squarePerimeter(4);
        System.out.println("4.2. Периметр квадрата " + perim1);

        float min1 = convertSecondsToMinutes(320);
        System.out.println("5. Минуты " + min1);

        double average1 = averageSpeed(5, 0);
        System.out.println("6.1. Средняя скорость " + average1);

        double average2 = averageSpeed(80, 50);
        System.out.println("6.2. Средняя скорость " + average2);

        double hypotenuse1 = findHypotenuse(3, 4);
        System.out.println("7.1. Гипотенуза " + hypotenuse1);

        double hypotenuse2 = findHypotenuse(30, 40);
        System.out.println("7.2. Гипотенуза " + hypotenuse2);

        double circle1 = circleCircumference(5);
        System.out.println("8.1. Длина окружности " + circle1);

        double circle2 = circleCircumference(10);
        System.out.println("8.2. Длина окружности " + circle2);

        double part1 = calculatePercentage(100, 25);
        System.out.println("9.1. Процент от числа " + part1);

        double part2 = calculatePercentage(200, 25);
        System.out.println("9.2. Процент от числа " + part2);

        double degree1 = celsiusToFahrenheit(52);
        System.out.println("10.1. Градусы Фаренгейт " + degree1);

        double degree2 = fahrenheitToCelsius(100);
        System.out.println("10.2. Градусы Цельсия " + degree2);
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

    public static int findMax(int a, int b){
        return Integer.max(a, b);
    }

    public static int difference(int x, int y){
        return abs(x - y);
    }

    public static int squareArea(int side){
        return side * side;
    }

    public static int squarePerimeter(int side){
        return 4 * side;
    }

    public static float convertSecondsToMinutes(int seconds) {
        return (float) seconds / 60;
    }

    public static double averageSpeed(double distance, double time){
        if (time > 0) {
            return (double) distance / time;
        } else {
            System.out.println("6.1. Время должно быть больше нуля.");
            return Double.NaN;
        }

    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static double circleCircumference(double radius){
        return (double) 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part){
        return (double) (part * 100) / total;
    }

    public static double celsiusToFahrenheit(double с){
        return (double) с * (9/5) + 32;
    }

    public static double fahrenheitToCelsius(double f){
        return (double) (f - 32) * (5/9);
    }
}
