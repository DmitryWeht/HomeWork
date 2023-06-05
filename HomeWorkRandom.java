package HomeWork;
import java.util.Random;

public class HomeWorkRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28801);

        System.out.println("Осталось " + n + " секунд");
        System.out.println(getRemainingHours(n));
    }

    public static String getRemainingHours(int seconds) {
        int hours = seconds / 3600;

        if (hours > 0) {
            return "Осталось " + hours + " час" + getHourSuffix(hours);
        } else {
            return "Осталось менее часа";
        }
    }

    public static String getHourSuffix(int hours) {
        if (hours >= 2 && hours <= 4) {
            return "а";
        } else if (hours == 1) {
            return "";
        } else {
            return "ов";
        }
    }
}
