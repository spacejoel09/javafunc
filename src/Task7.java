import java.util.Scanner;

public class Task7 {
    public static int factorial(int a){
        int sum = 1;
        for(int i = 1; i<=a;i++){

            sum *=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b =factorial(a);
        System.out.println("Factorial = "+b);
    }
}
