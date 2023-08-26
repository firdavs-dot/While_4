import java.util.Scanner;

public class for24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum =0.0;
        int n = input.nextInt();
        double x = input.nextDouble();
        for (int i = 0; i <= n; i++){
            double term = Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i );
            sum += term;
        }
        System.out.println(sum);

    }
    public static double factorial(int n){
        double result = 1.0;
        for (int i = 2; i <= n; i++){
            result*=i;
        }
        return result;

    }


}
