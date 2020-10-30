import java.io.*;
import java.util.*;
class IsPerfectSquare{
    public static boolean isPerfectSquare(int num){
        int lastDigit = num % 10;
        if(lastDigit == 2 || lastDigit == 3 || lastDigit == 7 || lastDigit == 8){
            return false;
        }
        for(int i = 0; i * i <= num; i++){
            if(i * i == num){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER: ");
        int n = sc.nextInt();
        if(isPerfectSquare(n)){
            System.out.println(n+ " IS A VALID PERFECT SQUARE");
        }
        else{
            System.out.println(n+ " IS NOT A VALID PERFECT SQUARE");
        }
    }
}