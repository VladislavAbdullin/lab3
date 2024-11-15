import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание (1,2):");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Читаем оставшийся символ новой строки

        switch (choice) {

            case 1:
                System.out.println("Задание № 2.1:");
                System.out.println("Введите числа через запятую для создания списка:");

                String input = scanner.nextLine().trim(); // Считываем строку с числами и убираем лишние пробелы

                // Проверка на пустой ввод
                if (input.isEmpty()) {
                    // Если строка пустая, создаём пустой список
                    NSZ emptyList = new NSZ(new int[0]);
                    System.out.println("Созданный список: " + emptyList);
                    System.out.println("Размер списка: " + emptyList.size());
                    System.out.println("Список пуст: " + emptyList.isEmpty());
                    break;
                }

                // Разделяем строку по запятой
                String[] inputNumbers = input.split(",");
                int[] numbers = new int[inputNumbers.length];

                // Преобразуем введенные значения в массив целых чисел
                for (int i = 0; i < inputNumbers.length; i++) {
                    try {
                        numbers[i] = Integer.parseInt(inputNumbers[i].trim()); // Убираем пробелы и преобразуем в числа
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка ввода: " + inputNumbers[i] + " не является числом.");
                        return;  // Завершаем выполнение программы при ошибке ввода
                    }
                }

                // Создаем неизменяемый список
                NSZ list = new NSZ(numbers);
                System.out.println("Созданный список: " + list);

                // Пример работы с методами
                int size = list.size();
                System.out.println("Размер списка: " + (size > 0 ? size - 1 : "-"));
                System.out.println("Список пуст: " + list.isEmpty());

                // Получение элемента по индексу
                try {
                    System.out.print("Введите индекс для получения значения: ");
                    int index = Integer.parseInt(scanner.nextLine()); // Считываем строку
                    System.out.println("Значение по индексу " + index + ": " + list.get(index));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                    return; // Прерываем выполнение программы, так как ошибка произошла
                }

                // Замена значения в списке
                try {
                    System.out.print("Введите индекс для замены значения: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    System.out.print("Введите новое значение: ");
                    int newValue = Integer.parseInt(scanner.nextLine());
                    list = list.set(index, newValue); // Создаем новый список с заменой
                    System.out.println("Обновленный список: " + list);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                    return; // Прерываем выполнение программы, так как ошибка произошла
                }

                // Пример вывода списка как массива
                System.out.println("Массив значений: " + Arrays.toString(list.toArray()));

                break;
            case 2:
                System.out.println("Задание № 3.5:");
                Zad3z5.inputPoints(3);
                break;


            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите задание 1,2");
                break;
        }
    }
}
