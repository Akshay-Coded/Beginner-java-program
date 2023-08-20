import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        int n,length = 0,tot = 0;
        Scanner sc = new Scanner(System.in);  //defining scanner object
        System.out.println("Enter the number to find armstrong number: ");
        n = sc.nextInt();
        int tmp = n;
        while(tmp != 0){  //gettin the length of number
            tmp = tmp/10;
            length++;
        }
        
        tmp = n;
        while (tmp != 0){  //adding the digits with a power of total number of digits
            int rem = tmp%10;
            tmp = tmp/10;
            tot += (Math.pow(rem,length));
        }
        
        if(tot == n){  //comparing for armstrong number
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
    }
}
