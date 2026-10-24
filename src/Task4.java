import java.util.Scanner;
public class Task4 {
    public static void matrix(int a,int b){
        int coun = 1;
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=b; j++){
                System.out.print(coun + " ");
                coun++;

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        matrix(a,b);

    }
}
