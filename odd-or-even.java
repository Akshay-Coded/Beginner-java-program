import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);  //defining scanner object
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("The entered number is even");
        }
        else{
            System.out.println("The entered number is odd");
        }
    }
}
