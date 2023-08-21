//reverse right angle star pattern
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);  //defining scanner object
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();  //getting number of rows as input
        for(int i = 0;i < n;i++){//printing star pattern with loops
            for(int j = 0;j < i;j++){
                System.out.print("  ");
            }
            for(int k = n-i;k > 0;k--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
