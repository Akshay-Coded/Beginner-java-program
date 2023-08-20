import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n,num1 = 0,num2 = 1,num=0;//first 2numbers are pre defined
        Scanner sc = new Scanner(System.in);  //defining scanner object
        System.out.print("Enter number of elements in series = ");
        n=sc.nextInt();//getting number of elements
        if(n==1){
            System.out.println("The Fibonacci series is: "+num1);
        }
        else if(n==2){
            System.out.println("The Fibonacci series is: "+num1+" "+num2);
        }
        else{
            System.out.print("The Fibonacci series is: "+num1+" "+num2+" ");//adding previous two element in the loop
            for(int i = 0;i < n-2;i++){
                num = num2 + num1;
                num1 = num2;
                num2 = num;
                System.out.print(num+" ");
            }
        }
    }
}
