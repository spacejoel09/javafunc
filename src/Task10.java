import java.util.Scanner;

public class Task10 {
    public static void GCD(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);


    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        GCD(a,b);


    }
}
