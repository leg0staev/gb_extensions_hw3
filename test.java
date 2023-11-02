import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Введите значение (для выхода введите 'exit'): ");
            input = scanner.nextLine();

            // Действия с полученным значением
            // Например, можно проверить, является ли введенное значение числом и выполнить соответствующие операции

            // Пример: вычисление суммы чисел
            if (!input.equalsIgnoreCase("exit")) {
                int number = Integer.parseInt(input);
                // Выполнение операций с числом
                // Например, можно добавить число к сумме
            }

        } while (!input.equalsIgnoreCase("exit"));
        
        // Код после выхода из цикла
        System.out.println("Вы вышли из цикла");
    }
}
