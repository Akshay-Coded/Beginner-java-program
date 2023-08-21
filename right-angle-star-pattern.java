//right angle star pattern
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);  //defining scanner object
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();  //getting the number of rows as input
        for(int i = 1;i < n+1;i++){ //using two loops to print *
            for(int j = 1;j < i+1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
