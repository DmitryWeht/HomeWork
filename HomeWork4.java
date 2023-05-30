package HomeWork;


public class HomeWork4 {
    public static void celsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        System.out.println(celsius + " градусов Цельсия = " + kelvin + " Кельвин");
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }

    public static void kelvinToCelsius(double kelvin) {
        double celsius = kelvin - 273.15;
        System.out.println(kelvin + " Кельвин = " + celsius + " градусов Цельсия");
    }

    public static double kelvinToFahrenheit(double kelvin) {
        double fahrenheit = kelvin * 9 / 5 - 459.67;
        return fahrenheit;
    }

    public static void fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Фаренгейт = " + celsius + " градусов Цельсия");
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double kelvin = (fahrenheit + 459.67) * 5 / 9;
        return kelvin;
    }
}