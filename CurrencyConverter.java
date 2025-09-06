import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Predefined exchange rates (relative to 1 USD)
        HashMap<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.92);
        exchangeRates.put("INR", 83.12);
        exchangeRates.put("GBP", 0.79);
        exchangeRates.put("JPY", 146.5);

        System.out.println("--- Currency Converter ---");
        System.out.println("Available currencies: USD, EUR, INR, GBP, JPY");

        // Base currency
        System.out.print("Enter base currency: ");
        String baseCurrency = sc.next().toUpperCase();

        // Target currency
        System.out.print("Enter target currency: ");
        String targetCurrency = sc.next().toUpperCase();

        // Amount
        System.out.print("Enter amount to convert: ");
        double amount = sc.nextDouble();

        if (exchangeRates.containsKey(baseCurrency) && exchangeRates.containsKey(targetCurrency)) {
            // Conversion logic
            double amountInUSD = amount / exchangeRates.get(baseCurrency);
            double convertedAmount = amountInUSD * exchangeRates.get(targetCurrency);

            System.out.println(amount + " " + baseCurrency + " = " + convertedAmount + " " + targetCurrency);
        } else {
            System.out.println("Invalid currency entered!");
        }

        sc.close();
    }
}
