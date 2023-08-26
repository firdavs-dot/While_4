import java.util.Scanner;

public class for17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        double a = input.nextInt();
        double sum=0;
        for (double i = 1; i <= n; i++){
            double d=(double)Math.pow(a,i);
            System.out.println(d);
            sum+=d;
        }
        System.out.println(sum);

    }
}
