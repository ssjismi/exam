public class Celsius {
    public double convert(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("c:" + celsius + "f:" + fahrenheit);
        return fahrenheit;
    }

    public double convert(double fahrenheit, boolean isFahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("c:" + celsius + "f:" + fahrenheit);
        return celsius;
    }

    public static void main(String[] args) {
        Celsius c1 = new Celsius();
        c1.convert(25);
        c1.convert(77, false);
    }

}
