import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int num,rem, reverse_num = 0;
        Scanner sc = new Scanner(System.in);  //defining scanner object
        System.out.print("Enter a word to check for palindrome = ");
        num = sc.nextInt();//getting input
        int numx = num;
        while(num!=0){//reversing number with a loop
            rem = num % 10;
            num = num / 10;
            reverse_num = (reverse_num*10)+rem;
        }
        if(numx == reverse_num){//comparing the reverse and original numbers
            System.out.println("The entered number is palindromic");
        }
        else{
            System.out.println("The entered number number is non palindromic");
        }
    }
}
