import java.util.Scanner;

public class SecondTask {
    /**
     * Метод сравнения строк
     */
    private static void stringCompare(String a, String b){
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку a: ");
        String a = scanner.nextLine();
        System.out.print("Введите строку b: ");
        String b = scanner.nextLine();
        stringCompare(a,b);
        scanner.close();
    }
}
