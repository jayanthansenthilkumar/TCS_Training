import java.util.*;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int count_star = 0;
        int count_hash = 0;
        for (int i = 1; i <= string.length(); i++) {
            char a = string.charAt(i - 1);
            if (a == '*') {
                count_star++;
            } else if (a == '#') {
                count_hash++;
            }
        }
        String Final = (count_star > count_hash) ? "Positive" : count_hash > count_star ? "Negative" : "0";
        System.out.println(Final);
    }
}