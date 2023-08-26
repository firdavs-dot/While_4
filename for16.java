import java.util.Scanner;

public class for16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a=input.nextInt();
        double n=input.nextInt();
        double result=1.0;
        for (double i=1;i<=n;i++)
        {
            double d= (double) Math.pow(a,i);
            System.out.println(d);
        }




    }
}
