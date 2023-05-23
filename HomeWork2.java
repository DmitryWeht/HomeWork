package HomeWork;

public class HomeWork2 {
    //Используя String.valueOf()

        public static void main(String[] args) {
            char ch = '4';

            int result = Integer.parseInt(String.valueOf(ch));
            result += 6;

            System.out.println("Результат: " + result);
        }

        // Используя Character.getNumericValue()
    public static void main(String[] args) {
        char ch = '4';

        int result = Character.getNumericValue(ch);
        result += 6;

        System.out.println("Результат: " + result);
    }




    }

