import java.util.Arrays;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int Jayanthan[] = new int [size];
        int sum = 0;
        for(int i=0; i<size; i++){
            Jayanthan[i] = input.nextInt();
            sum += Jayanthan[i];
        }
    System.out.println(sum);
   }
}