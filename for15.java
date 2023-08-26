import java.util.Scanner;

public class for15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a=input.nextDouble();
        double n =input.nextDouble();
        double result=1.0;
        int sum=0;
        for (double i=1;i<=n;i++){
            result*=a;}
        System.out.println(result);
    }
}
