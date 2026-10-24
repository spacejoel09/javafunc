import java.util.Scanner;
public class Task1 {

    public static void printStrip(int a){
        for(int i= 1; i <=a; i++){
            System.out.print("#");
        }
    }

    public static void main(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        printStrip(a);
    }
}
