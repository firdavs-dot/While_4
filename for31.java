import java.util.Scanner;

public class for31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double a0 = 1;
        for (double i = 1; i <= n; i++) {
            double Ai = 2 + 1 / a0;
            a0 = Ai;

            System.out.println(a0);
        }
    }
}
