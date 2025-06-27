import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income (in ₹): ");
        double income = sc.nextDouble();
        double tax;
        if (income < 10000)
            tax = 0;
        else if (income <= 30000)
            tax = (income - 10000) * 0.10;
        else if (income <= 50000)
            tax = 2000 + (income - 30000) * 0.20;
        else
            tax = 6000 + (income - 50000) * 0.30;
        System.out.println("Income Tax: ₹" + tax);
    }
}