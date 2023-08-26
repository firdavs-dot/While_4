import java.util.Scanner;

public class for32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        double a0=1;
        for (double i = 1; i <= n; i++){
            double Ai=(a0+1)/i;
            a0=Ai;
            System.out.println(a0);
        }
    }
}
