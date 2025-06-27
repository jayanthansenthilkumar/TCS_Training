import java.util.Scanner;
public class AverageAndDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double average = total / 5.0;
        if (average > 90)
            System.out.println("Distinction");
        else if (average >= 75)
            System.out.println("First Division");
        else if (average >= 50)
            System.out.println("Second Division");
        else
            System.out.println("Fail");
    }
}