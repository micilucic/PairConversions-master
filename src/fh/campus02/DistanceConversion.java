package fh.campus02;

public class DistanceConversion {
    public static void main(String[] args) {
        int kilometers = 20;
        int miles = 5;

        System.out.println(kilometers + " kilometers are " + kilometersToMiles(kilometers) + " miles");
        System.out.println(miles + " miles are " + milesToKilometers(miles) + " kilometers");
    }
    public static double kilometersToMiles(int kilometers) {
        return kilometers * 0.621371;
    }
    public static double milesToKilometers(int miles) {
        return miles * 1.60934;
    }
}
