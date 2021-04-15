import java.util.Scanner;

/**
 * 2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
 * Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев,
 * a банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
 * Для вычисления суммы с учетом процентов используйте цикл for.
 * Пусть сумма вклада будет представлять тип float.
 */
public class Bank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your deposit value");
        float startDeposit = input.nextFloat();
        float totalBalance = startDeposit;
        float bankMonthlyCharges = startDeposit * 7 / 100;

        System.out.println("Enter month count");
        int monthCount = input.nextInt();

        for (int i = 0; i < monthCount; i++) totalBalance += bankMonthlyCharges;
        System.out.println("In " + monthCount + " months your balance will be: " + totalBalance);
    }

}