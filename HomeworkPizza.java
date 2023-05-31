package HomeWorkPizza;
import java.util.Scanner;

public class HomeworkPizza {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диаметр текущей пиццы (в см): ");
        double currentDiameter = scanner.nextDouble();
        System.out.print("Введите диаметр новой пиццы (в см): ");
        double newDiameter = scanner.nextDouble();
        scanner.close();


        double currentArea = calculatePizzaArea(currentDiameter);
        double newArea = calculatePizzaArea(newDiameter);


        double extraCalories = (newArea - currentArea) * 40;


        System.out.println("Количество лишних калорий: " + extraCalories);
    }


    public static double calculatePizzaArea(double diameter) {
        double radius = diameter / 2;
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
