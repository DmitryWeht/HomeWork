 package HomeWork;

public class HomeWork3Box {

        private final double width;
        private final double height;
        private final double length;

    public HomeWork3Box(double width, double height, double length) {
            this.width = width;
            this.height = height;
            this.length = length;
            double volume = calculateVolume();
            System.out.println("Объем коробки: " + volume);
        }

        private double calculateVolume() {
            return width * height * length;
        }

        public static void main(String[] args) {
            new HomeWork3Box(10.0, 5.0, 3.0);
        }
}
