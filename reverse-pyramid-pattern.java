//reverse pyramid pattern
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);  //defining scanner object
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt(); //getting number of rows
        for(int i = n;i >= 0;i--){//printing a reverse pyramid pattern
            for(int j = 0;j <= (n-i-1);j++){
                System.out.print(" ");
            }
            for(int k = i;k >= 0;k--){
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
