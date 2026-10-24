import java.util.Scanner;
public class Task3 {
    public static void printPyramid(int a){
        for(int i = a; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        printPyramid(a);
    }
}
