import java.util.Scanner;

public class for27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        double x=input.nextDouble();
        double sum=x;
        for (int i=1;i<=n;i++){
            sum+=(2*i-1)*Math.pow(x,(2*i+1))/(2*i*(2*i+1));
        }
        System.out.println(sum);
    }
}
