//converting the input from farenheit to celsius
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int farenheit,celsius;
        Scanner sc = new Scanner(System.in);  //defining scanner object
        System.out.print("Enter the temperature in degree farenheit: ");
        farenheit = sc.nextInt(); //getting input
        celsius = (((farenheit - 32) *  5) / 9);  //formula to calculate celsius fromfarenheit
        System.out.println("The temperature in celsius is " + celsius + "\u00B0"+"C"); //conclusion
    }
}
