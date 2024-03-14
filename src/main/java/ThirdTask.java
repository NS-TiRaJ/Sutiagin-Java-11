public class ThirdTask {
    /**
     * Метод поиска четных чисел в числовом массиве
     * @param a Числовой массив
     */
    private static void findEvenNumberInArray(int[] a){
        System.out.println("Четные числа в массиве:");
        for (int number : a) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        findEvenNumberInArray(numbers);
    }
}
