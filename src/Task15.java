import java.util.Scanner;

public class Task15 {
    public static boolean isPalindrome(int a){
        if(a <= 0)return false;
        int reversed = 0;
        int original = a;
        while(a > 0){
            int digit = a %10;
            reversed = reversed * 10 +digit;
            a /=10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        if(isPalindrome(a)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not");
        }

    }
}
