package HomeWork;

import java.util.Scanner;

public class HomeWorkLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту здания (H): ");
        int H = scanner.nextInt();

        System.out.print("Введите количество этажей подъема (N): ");
        int N = scanner.nextInt();

        System.out.print("Введите количество этажей спуска (M): ");
        int M = scanner.nextInt();

        int totalFloors = 0;
        int lifts = 0;

        while (totalFloors < H) {
            totalFloors += N;
            lifts++;

            if (totalFloors >= H) {
                break;
            }

            totalFloors -= M;
        }

        System.out.println("Количество подъемов, необходимых лифту: " + lifts);
    }
}
