import java.util.Scanner;

public class Task6{
    public static int findPrime(int a, int b){
        int count = 0;
        for(int i = a; i<=b; i++){
            if(i < 2){
                continue;
            }
            boolean isPrime = true;
            for(int j = 2; j*j <=i; j++){
                if( i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            double  d = Math.sqrt(i);
            if (isPrime) {
                count++;
            }


        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b = in.nextInt();
        int d = findPrime(a,b);
        System.out.println("Prime Count = " + d);
    }
}