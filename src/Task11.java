import java.util.Scanner;

public class Task11 {
    public static int GCD(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;


    }
    public static int LCM(int a,int b){
        if( a == 0 || b ==0){
            return 0;
        }
        return(a / GCD(a,b) ) *b;


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(LCM(a,b));
    }
}
