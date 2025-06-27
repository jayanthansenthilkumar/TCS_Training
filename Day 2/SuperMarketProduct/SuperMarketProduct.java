import java.util.*;
public class SuperMarketProduct {
    public static void main(String[] args) {
        int price=1;
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        while(size>0){
            int r=size%10;
            price=r*price;
            size=size/10;
       }
       System.out.println(price);
    }
}