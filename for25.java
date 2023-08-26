import java.util.Scanner;

public class for25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        double x=input.nextDouble();
        double sum=0;
        for (double i=1;i<=n;i++){
           sum+= Math.pow(-1,i+1)*Math.pow(x,i)/i;
        }
        System.out.println(sum);

    }
}
