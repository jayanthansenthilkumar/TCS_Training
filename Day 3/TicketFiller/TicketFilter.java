import java.util.*;
public class TicketFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("EF", "");
        s = s.replace("56", "");
        s = s.replace("G", "");
        s = s.replace("&", "");
        System.out.println(s);
    }
}