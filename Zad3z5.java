import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Задание №1
class Zad3z5 {
    private double x;
    private double y;
    private double z;

    public Zad3z5(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Точка: {" + x + "; " + y + "; " + z + "}";
    }

    public static List<Zad3z5> inputPoints(int count) {
        Scanner scanner = new Scanner(System.in);
        List<Zad3z5> points = new ArrayList<>();

        for (int i = 1; i <= count; i++) {

            double x = 0;
            double y = 0;
            double z = 0;

            boolean validX = false;
            while (!validX) {
                try {
                    System.out.print("Введите координату X для точки " + i + ": ");
                    String inputX = scanner.nextLine();
                    x = Double.parseDouble(inputX);
                    System.out.print("Введите координату Y для точки " + i + ": ");
                    String inputY = scanner.nextLine();
                    y = Double.parseDouble(inputY);
                    System.out.print("Введите координату Z для точки " + i + ": ");
                    String inputZ = scanner.nextLine();
                    z = Double.parseDouble(inputZ);
                    validX = true;
                    Zad3z5 point = new Zad3z5(x, y, z);
                    points.add(point);
                    System.out.println(point);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка!\nВведите корректное значение");

                }
            }
        }
        return points;
    }
}
