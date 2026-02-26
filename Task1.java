import java.util.Scanner;

class PortfolioAnalyzer{
    public Double[] CalculateDailyProfit(Double[] open, Double[] close, Double[] profits) {
        Integer n = open.length;
        for (int i = 0; i < open.length; i++) {
            profits[i] = close[i] - open[i];
        }
        return profits;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter total number of stocks: ");
        int N = inp.nextInt();
        Double[] opening = new Double[N];
        Double[] closing = new Double[N];
        Double[] profit = new Double[N];
        // Populating opening Array
        System.err.println("Enter opening values of stocks: ");
        for (int i = 0; i < N; i++) {
            opening[i] = inp.nextDouble();
        }
        // populating closing array
        System.out.println("Enter closing value of stocks: ");
        for (int i = 0; i < N; i++) {
            closing[i] = inp.nextDouble();
        }
        // Calling function
        PortfolioAnalyzer obj1 = new PortfolioAnalyzer();
        profit = obj1.CalculateDailyProfit(opening, closing, profit);
        // printing profit
        System.err.println("Printing profits: ");
        for (int i = 0; i < N; i++) {
            System.err.printf("%.2f\t", profit[i]);
        }
        inp.close();
    }
}