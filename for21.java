import java.util.Scanner;

public class for21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        double sum=1;
        for(double i=1;i<=n;i++){
            double fakt=1;
            for(double j=1;j<=i;j++)
                fakt*=j;
            sum+=1/fakt;

        }
        System.out.println(sum);
    }
}
