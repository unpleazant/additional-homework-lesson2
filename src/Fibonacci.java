/**
 * 1. Выведите на экран первые 11 членов последовательности Фибоначчи
 */
public class Fibonacci {

    public static void main(String[] args){
        int numberOne = 1;
        int numberTwo = 1;
        int sum;

        System.out.print(numberOne + " " + numberTwo + " ");
        for (int i = 3; i <= 11; i++) {
            sum = numberOne + numberTwo;
            System.out.print(sum + " ");
            numberOne = numberTwo;
            numberTwo = sum;
        }
        System.out.println();
    }
}