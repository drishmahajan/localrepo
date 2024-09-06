import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class sal {
    static Locale locale = null;
    static ResourceBundle rb = null;

    static double getTax(double basic_salary) {
        double annual_salary = basic_salary * 12;
        if (annual_salary <= 500000) {
            return 0;
        } else {
            return annual_salary * 0.05;
        }
    }

    static String formatDate() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        return df.format(new Date());
    }

    static String currencyFormat(double n) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for English");
        System.out.println("हिंदी के लिए 2 दबाएँ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                locale = new Locale("en", "US");
                break;
            case 2:
                locale = new Locale("hi", "IN");
                break;
            default:
                System.out.println("Invalid choice");
                scanner.close();
                return; // Exit the program
        }

        // Load the resource bundle based on the selected locale
        rb = ResourceBundle.getBundle("messages", locale);

        System.out.println(rb.getString("enter_name"));
        String name = scanner.nextLine();

        System.out.println(rb.getString("enter_salary"));
        double basic_salary = scanner.nextDouble();

        System.out.println("Name: " + name);

        double hra = basic_salary * 0.10;
        double tax = getTax(basic_salary) / 12;
        double gs = basic_salary + hra;
        double ns = gs - tax;

        System.out.println(rb.getString("basic_salary") + ": " + currencyFormat(basic_salary));
        System.out.println("HRA: " + currencyFormat(hra));
        System.out.println("TAX: " + currencyFormat(tax));
        System.out.println("GS: " + currencyFormat(gs));
        System.out.println("NS: " + currencyFormat(ns));

        scanner.close();
    }
}
