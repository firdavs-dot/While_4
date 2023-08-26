import java.util.Scanner;

public class for36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        double k = input.nextInt();
        double sum=0;
        for (double i = 1; i <= k; i++){
            double d=(double)Math.pow(n,i);
            System.out.println(d);
            sum+=d;
        }
        System.out.println(sum);

    }
}