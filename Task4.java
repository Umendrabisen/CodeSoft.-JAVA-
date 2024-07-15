
import java.util.Scanner;

public class Task4{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nCurrency Converter");
            System.out.println("1. USD to EUR");
            System.out.println("2. EUR to USD");
            System.out.println("3. USD to GBP");
            System.out.println("4. GBP to USD");
            System.out.println("5. USD to INR");
            System.out.println("6. INR to USD");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertCurrency("USD", "EUR", 0.85);
                    break;
                case 2:
                    convertCurrency("EUR", "USD", 1.18);
                    break;
                case 3:
                    convertCurrency("USD", "GBP", 0.75);
                    break;
                case 4:
                    convertCurrency("GBP", "USD", 1.33);
                    break;
                case 5:
                    convertCurrency("USD", "INR", 74.50);
                    break;
                case 6:
                    convertCurrency("INR", "USD", 0.013);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void convertCurrency(String fromCurrency, String toCurrency, double conversionRate) {
        System.out.printf("Enter amount in %s: ", fromCurrency);
        double amount = scanner.nextDouble();
        double convertedAmount = amount * conversionRate;
        System.out.printf("%.2f %s is equal to %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
    }
}