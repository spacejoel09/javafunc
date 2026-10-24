import java.util.Scanner;

public class Task8 {
    public static void binary(int a){

        if(a == 0){
            System.out.println(0);
            return;
        }
        String we = "";
       while(a>0){
           int r = a %2;
           we = r + we;
           a = a /2;
       }
        System.out.println(we);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        binary(a);
    }
}
