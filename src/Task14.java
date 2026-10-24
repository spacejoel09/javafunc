import java.util.Scanner;

public class Task14 {
    public static int transform(int a){
        if(a ==0) {
            return 1;
        }
        int res = 0;
        int de = 1;
        while(a> 0){
            int dig = a %10;
            if(dig %2 ==0){
                dig++;
            }else{
                dig--;
            }
            res+=dig*de;
            de*=10;
            a /=10;

        }


        return res;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(transform(a));
    }
}
