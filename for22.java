import java.util.Scanner;

public class for22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        double x = input.nextDouble();
        double sum = 1.0;
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= x / i;
            sum += term;
        }
        System.out.println(term);

        System.out.println(sum);
    }
}
