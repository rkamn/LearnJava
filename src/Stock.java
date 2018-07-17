/**
 * Create a new class called “Stock” which contains the following:
 * ·         A String for the stock name
 * ·         A String for the stock symbol
 * ·         A double storing the previous closing price of the stock
 * ·         A double storing the current closing price of the stock
 * ·         A constructor that allows you to define a stock’s name, symbol, previous closing price and current closing price
 * ·         A method getChangePercentage() that returns the percentage change from the previous closing price to the current closing price
 *
 */

import java.util.Scanner;

public class Stock {

    private static String stockName, stockSymbol;
    private static double previousClosing, currentClosing;

    Stock() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Stock's Name: ");
        stockName = s.nextLine();
        System.out.println("Enter Stock's symbol: ");
        stockSymbol = s.nextLine();
        System.out.println("Enter it's previous closing price: ");
        previousClosing = s.nextDouble();
        System.out.println("Enter current closing price: ");
        currentClosing = s.nextDouble();

    }

    public static double getChangePercentage() {

        double c;
        c = ((currentClosing - previousClosing) / currentClosing) * 100;
        return c;
    }

}
