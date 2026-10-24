import java.util.Scanner;

public class Task12 {
    public static int reverse(int a){
        int r = 0;
        while(a != 0){
            int digit = a %10;
            r =  r * 10 +digit;
            a /=10;
        }

        return r;
    }
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(reverse(a));
    }
}
