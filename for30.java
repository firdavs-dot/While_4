import java.util.Scanner;

public class for30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        double a=input.nextDouble();
        double b=input.nextDouble();
        double uzunlik =(b-a)/n;
        for(double i=0;i<=n;i++){
            double  sum=a+uzunlik*i;
            double F=1-Math.sin(sum);
            System.out.println(F);
        }
    }
}
