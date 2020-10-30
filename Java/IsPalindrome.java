import java.io.*;
import java.util.*;
class IsPalindrome{
    public static boolean isPalindrome(int x){
        int start = 0;
        String s = Integer.toString(x);
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER: ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println(n+ " IS A PALINDROME NUMBER");
        }
        else{
            System.out.println(n+ " IS NOT A PALINDROME NUMBER");
        }
    }
}