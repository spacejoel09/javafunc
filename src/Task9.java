public class Task9 {
    public static boolean isArmstrong(int n){
        int a = n;
        int b = 0;
        while (n > 0) {
            int digit = n % 10;
            b += digit * digit * digit;
            n /= 10;
        }

        return b == a;
    }
    public static void main(String[] args) {
        for(int i=1; i<=999;i++){
            if(isArmstrong(i)) System.out.println(i);
        }
    }
}
