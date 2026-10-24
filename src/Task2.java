import java.util.Scanner;
public class Task2 {
    public static void rectangle(int a, int b){
        System.out.println();
        for (int c = 1; c<=a;c++){
            for(int i = 1; i<=b; i++){

                if (c == 1 || c == a || i == 1 || i== b) {
                    System.out.print('*');
                }
                else System.out.print(' ');

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        rectangle(a,a);
    }
}
