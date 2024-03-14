import java.util.Scanner;

/**
 * Первое задание
 */
public class FirstTask {

    /**
     * Метод сравнения a и b
     */
    private static void compare(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    /**
     * Метод поиска суммы, разности, произведения и частного
     */
    private static void math(int a, int b) {
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double division = (double) a / b;
        System.out.println("Сумма a и b: " + sum);
        System.out.println("Разность a и b: " + difference);
        System.out.println("Произведение a на b: " + product);
        System.out.println("Частное от a на b: " + division);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        compare(a, b);
        math(a, b);
        scanner.close();
    }
}