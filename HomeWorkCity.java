package HomeWork;


interface Country {
    void printCountryName();
}


class Germany implements Country {
    private String countryName;

    public Germany(String countryName) {
        this.countryName = countryName;
    }

    public void printCountryName() {
        System.out.println("Страна: " + countryName);
    }
}


interface State {
    void printStateName();
}


class Bavaria implements State {
    private String stateName;

    public Bavaria(String stateName) {
        this.stateName = stateName;
    }

    public void printStateName() {
        System.out.println("Штат: " + stateName);
    }
}


interface City {
    void printCityName();
}


class Munich implements City {
    private String cityName;

    public Munich(String cityName) {
        this.cityName = cityName;
    }

    public void printCityName() {
        System.out.println("Город: " + cityName);
    }
}

public class HomeWorkCity {
    public static void main(String[] args) {

        Country germany = new Germany("Германия");



        State bavaria = new Bavaria("Бавария");


        City munich = new Munich("Мюнхен");



        germany.printCountryName();
        bavaria.printStateName();
        munich.printCityName();


    }
}

