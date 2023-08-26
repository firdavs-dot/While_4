import java.util.Scanner;

public class for18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        double n = input.nextInt();
        double sum=0;
        for(int i = 0; i <= n; i += 1 ){
            sum += Math.pow(-1, i) * Math.pow(a, i);
        }
        System.out.println(sum);
    }
}
