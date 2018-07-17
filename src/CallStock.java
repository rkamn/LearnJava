public class CallStock {

    public static void main(String[] args) {

        Stock s = new Stock();
        double a = s.getChangePercentage();
        System.out.println("Percentage change in stock price is: "+a);
    }
}
