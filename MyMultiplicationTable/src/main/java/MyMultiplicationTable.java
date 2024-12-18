import java.math.BigInteger;
import java.util.Scanner;

public class MyMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger number = BigInteger.ZERO;
        boolean validInput = false;

        // Запрашиваем число у пользователя с проверкой на корректность
        while (!validInput) {
            try {
                System.out.println("Введи целое число для вывода таблицы умножения:");
                String input = scanner.next(); // Считываем строку
                number = new BigInteger(input); // Преобразуем строку в BigInteger
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: ты ввёл не число.");
            }
        }

        System.out.println("Таблица умножения для числа " + number + ":");

        // Используем цикл для вывода таблицы умножения
        for (int i = 1; i <= 10; i++) {
            BigInteger result = number.multiply(BigInteger.valueOf(i)); // Умножаем число на i
            System.out.printf("%s x %2d = %s\n", number, i, result);
        }

        scanner.close();
    }
}