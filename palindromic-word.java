import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String word, reverse_word = "";
        Scanner sc = new Scanner(System.in);  //defining scanner object
        System.out.print("Enter a word to check for palindrome = ");
        word = sc.next();//getting the input from user
        int len = word.length();//getting length
        for (int i=len-1;i > -1;i--){
            reverse_word += word.charAt(i);//getting the reverse of the word
        }
        if(word.equals(reverse_word)){//comparing strings
            System.out.println("It is a palindromic word");
        }
        else{
            System.out.println("It is not a palindromic word");
        }
    }
}
