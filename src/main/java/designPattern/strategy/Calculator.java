package designPattern.strategy;

public class Calculator {
    public static void main(String[] args) {

        int km = 10;

        int busPrice = new PriceCalculator(new BusStrategy()).calculate(km);
        System.out.println(km + "公里, 價格為" + busPrice);


        int mrtPrice = new PriceCalculator(new MRTStrategy()).calculate(km);
        System.out.println(km + "公里, 價格為" + mrtPrice);
    }
}
