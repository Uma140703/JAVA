import java.io.*;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the palindrome or not");
        int rev=0;
        int n=sc.nextInt();
        int temp=n;
        while(n>0) {
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println(" After reversing the number is " +rev);
        if(rev==temp)
        {
            System.out.println(temp+ " Is a palindrome");
        }
        else
        {
            System.out.println(temp+ " Is not a palindrome");
        }
    }
}
