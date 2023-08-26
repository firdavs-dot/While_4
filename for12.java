import java.util.Scanner;

public class for12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 1;
        for (double i = 1; i <= n; i++) {
            sum *= 1.0 + 0.1*i;
        }
        System.out.println(sum);
    }
}
