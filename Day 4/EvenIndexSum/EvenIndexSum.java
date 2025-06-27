import java.util.Scanner;
public class EvenIndexSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}