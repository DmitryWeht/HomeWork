package HomeWork;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.close();

        String decimal = String.valueOf(number);
        String octal = Integer.toOctalString(number);
        String binary = Integer.toBinaryString(number);
        String hexadecimal = Integer.toHexString(number);

        System.out.println("Десятичное представление: " + decimal);
        System.out.println("Восьмеричное представление: " + octal);
        System.out.println("Двоичное представление: " + binary);
        System.out.println("Шестнадцатеричное представление: " + hexadecimal);
    }
}
