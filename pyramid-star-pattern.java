//pyramid star pattern
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);  //defining scanner object
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt(); //getting number of rows
        for(int i = 0;i < n;i++){ //printing stars with 3 loops
            for(int j =  (n-i-1);j >= 0;j--){
                System.out.print(" ");
            }
            for(int k = 0;k <= i;k++){
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
