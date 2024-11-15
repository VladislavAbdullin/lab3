import java.util.Arrays;

public class NSZ {
    // Неизменяемый массив целых чисел
    private final int[] values;

    // Конструктор с массивом целых чисел
    public NSZ(int[] values) {
        this.values = Arrays.copyOf(values, values.length); // Копирование массива
    }

    // Конструктор копирования другого списка
    public NSZ(NSZ other) {
        this(other.values);
    }

    // Получить значение по индексу
    public int get(int index) {
        if (index < 0 || index >= values.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка.");
        }
        return values[index];
    }

    // Метод для замены значения по индексу

    public NSZ set(int index, int newValue) {
        if (index < 0 || index >= values.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка.");
        }
        // Создаем новый список с обновленным значением
        int[] newValues = Arrays.copyOf(values, values.length);
        newValues[index] = newValue;
        return new NSZ(newValues);
    }
    // Метод toString для вывода списка
    @Override
    public String toString() {
        return Arrays.toString(values);
    }


    public boolean isEmpty() {
        return values.length == 0;
    }


    public int size() {
        return values.length;
    }

    // Получение значений в виде стандартного массива
    public int[] toArray() {
        return Arrays.copyOf(values, values.length);
    }
}
